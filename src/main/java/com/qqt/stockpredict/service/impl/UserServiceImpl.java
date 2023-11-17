package com.qqt.stockpredict.service.impl;

import cn.hutool.core.util.ObjectUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qqt.stockpredict.common.BaseResponse;
import com.qqt.stockpredict.common.ErrorCode;
import com.qqt.stockpredict.common.ResultUtils;
import com.qqt.stockpredict.exception.BusinessException;
import com.qqt.stockpredict.model.dto.UserRequest;
import com.qqt.stockpredict.model.entity.LoginUser;
import com.qqt.stockpredict.model.entity.User;
import com.qqt.stockpredict.model.vo.UserVO;
import com.qqt.stockpredict.service.UserService;
import com.qqt.stockpredict.mapper.UserMapper;
import com.qqt.stockpredict.utils.JwtUtil;
import com.qqt.stockpredict.utils.RedisCache;
import org.springframework.beans.BeanUtils;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/**
* @author QQT
* @description 针对表【user(用户表)】的数据库操作Service实现
* @createDate 2023-11-17 10:06:38
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

    /** 获取认证入口 */
    @Resource
    private AuthenticationManager authenticationManager;

    @Resource
    private RedisCache redisCache;

    @Resource
    private UserMapper userMapper;

    /**
     * 登录
     *
     * @param userRequest 用户请求
     * @param request     请求
     * @return {@link UserVO}
     */
    @Override
    public UserVO login(UserRequest userRequest, HttpServletRequest request) {
        // 在没认证之前principal, credentials两个参数分别存放用户名和密码
        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(userRequest.getUserName(),userRequest.getPassword());
        // 通过AuthenticationManager的authenticate方法来进行用户认证
        Authentication authenticate = authenticationManager.authenticate(authenticationToken);
        // 判断是否验证成功
        if(Objects.isNull(authenticate)){
            throw new BusinessException(ErrorCode.OPERATION_ERROR,"用户名或密码错误");
        }
        // 在认证信息authenticate中获取登录成功后的用户信息
        LoginUser loginUser = (LoginUser) authenticate.getPrincipal();
        // 使用userid生成token
        String userId = loginUser.getUser().getId().toString();
        String jwt = JwtUtil.createJWT(userId);
        // userId用作key，将用户信息存入redis，并设置30分钟过期
        redisCache.setCacheObject("login:" + userId, loginUser, 30, TimeUnit.MINUTES);
        // 把token响应给前端
        UserVO userVO = new UserVO();
        BeanUtils.copyProperties(userRequest, userVO);
        userVO.setToken(jwt);
        return userVO;
    }

    /**
     * 注销
     *
     * @return {@link BaseResponse}<{@link String}>
     */
    @Override
    public BaseResponse<String> logout() {
        // 从登录用户数据中获取userId
        Long userId = getUser().getId();
        // 从redis中将该用户的值删除
        redisCache.deleteObject("login:" + userId);
        return ResultUtils.success("退出登录成功");
    }

    /**
     * 获取登录用户
     *
     * @return {@link BaseResponse}<{@link UserVO}>
     */
    @Override
    public BaseResponse<UserVO> getLoginUser(){
        User user = getUser();
        UserVO userVO = new UserVO();
        BeanUtils.copyProperties(user,userVO);
        return ResultUtils.success(userVO);
    }

    /**
     * 注册
     *
     * @param userRequest 用户请求
     * @return {@link BaseResponse}<{@link UserVO}>
     */
    @Override
    // 添加中文注释后
public BaseResponse<UserVO> register(UserRequest userRequest) {
        // 密码加密
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        userRequest.setPassword(encoder.encode(userRequest.getPassword()));
        // 创建用户对象
        User user = new User();
        // 创建用户视图对象
        UserVO userVO = new UserVO();
        // 将用户请求的属性值复制到用户对象中
        BeanUtils.copyProperties(userRequest,user);
        // 将用户请求的属性值复制到用户视图对象中
        BeanUtils.copyProperties(userRequest,userVO);
        // 创建查询条件
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        // 设置查询条件
        userQueryWrapper.eq("username",userRequest.getUserName());
        // 判断用户名是否已存在
        if(userMapper.exists(userQueryWrapper)){
            // 如果存在，抛出异常
            throw new BusinessException(ErrorCode.OPERATION_ERROR,"用户已存在请直接登录");
        }
        // 插入用户
        userMapper.insert(user);
        return ResultUtils.success(userVO);
    }

    /**
     * 获取当前用户
     *
     * @return {@link User}
     */
    private static User getUser() {
        // 从SecurityContextHolder中获取认证信息
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        // 判空，避免登录已过期导致异常
        if (ObjectUtils.isEmpty(authentication)) {
            throw new BusinessException(ErrorCode.NOT_LOGIN_ERROR,"登录已经过期");
        }
        // 从认证信息中获取登录用户数据
        LoginUser loginUser = (LoginUser) authentication.getPrincipal();
        // 从登录用户数据中获取user
        return loginUser.getUser();
    }
}




