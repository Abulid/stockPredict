package com.qqt.stockpredict.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.qqt.stockpredict.common.ErrorCode;
import com.qqt.stockpredict.exception.BusinessException;
import com.qqt.stockpredict.mapper.UserMapper;
import com.qqt.stockpredict.model.entity.LoginUser;
import com.qqt.stockpredict.model.entity.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Resource
    private UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        //根据用户名查询用户信息
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("userName",userName);
        User user = userMapper.selectOne(wrapper);
        //如果查询不到数据就通过抛出异常来给出提示
        if(ObjectUtils.isEmpty(user)){
            throw new BusinessException(ErrorCode.OPERATION_ERROR,"用户名或密码错误");
        }
        //封装成UserDetails对象返回，其中LoginUser为UserDetails的实现类
        return new LoginUser(user);
    }
}
