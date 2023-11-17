package com.qqt.stockpredict.service;

import com.qqt.stockpredict.common.BaseResponse;
import com.qqt.stockpredict.model.dto.UserRequest;
import com.qqt.stockpredict.model.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.qqt.stockpredict.model.vo.UserVO;

import javax.servlet.http.HttpServletRequest;

/**
* @author QQT
* @description 针对表【user(用户表)】的数据库操作Service
* @createDate 2023-11-17 10:06:38
*/
public interface UserService extends IService<User> {

    /**
     * 登录
     *
     * @param userRequest 用户请求
     * @param request     请求
     * @return {@link UserVO}
     */
    UserVO login(UserRequest userRequest, HttpServletRequest request);

    /**
     * 注销
     *
     * @return {@link BaseResponse}<{@link String}>
     */
    BaseResponse<String> logout();

    /**
     * 获取登录用户
     *
     * @return {@link BaseResponse}<{@link UserVO}>
     */
    BaseResponse<UserVO> getLoginUser();

    /**
     * 注册
     *
     * @return {@link BaseResponse}<{@link UserVO}>
     */
    BaseResponse<UserVO> register(UserRequest userRequest);
}
