package com.qqt.stockpredict.controller;

import com.qqt.stockpredict.common.BaseResponse;
import com.qqt.stockpredict.common.ErrorCode;
import com.qqt.stockpredict.common.ResultUtils;
import com.qqt.stockpredict.exception.BusinessException;
import com.qqt.stockpredict.model.dto.UserRequest;
import com.qqt.stockpredict.model.vo.UserVO;
import com.qqt.stockpredict.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * 用户控制器
 *
 * @author QQTang
 * @Create 2023--11--17 10:11
 * @date 2023/11/17
 */
@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    /**
     * 用户服务
     */
    @Resource
    private UserService userService;

    /**
     * 登录
     *
     * @param userRequest 用户请求
     * @param request     请求
     * @return {@link BaseResponse}<{@link UserVO}>
     */
    @PostMapping("/login")
    public BaseResponse<UserVO> login(@RequestBody UserRequest userRequest, HttpServletRequest request) {
        if (userRequest == null || userRequest.getUserName() == null || userRequest.getPassword() == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        log.info("用户登录，用户名：" + userRequest.getUserName());
        UserVO userVO = userService.login(userRequest, request);
        return ResultUtils.success(userVO);
    }

    /**
     * 注销
     *
     * @return {@link BaseResponse}<{@link String}>
     */
    @GetMapping("/logout")
    public BaseResponse<String> logout() {
        return userService.logout();
    }

    /**
     * 测试一下
     *
     * @return {@link BaseResponse}<{@link String}>
     */
    @PostMapping("/hello")
    public BaseResponse<String> hello() {
        return ResultUtils.success("hello");
    }

    /**
     * 注册
     *
     * @param userRequest 用户请求
     * @return {@link BaseResponse}<{@link UserVO}>
     */
    @PostMapping("/register")
    public BaseResponse<UserVO> register(@RequestBody UserRequest userRequest){
        if(userRequest == null || userRequest.getUserName() == null || userRequest.getPassword() == null){
            throw new BusinessException(ErrorCode.PARAMS_ERROR,"注册失败，您的输入非法");
        }
        return userService.register(userRequest);


    }

    /**
     * 获取登录用户
     *
     * @return {@link BaseResponse}<{@link UserVO}>
     */
    @GetMapping("/loginuser")
    public BaseResponse<UserVO> getLoginUser(){
        return userService.getLoginUser();
    }
}
