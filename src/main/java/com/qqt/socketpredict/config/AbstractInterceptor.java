package com.qqt.socketpredict.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author lwc
 */
public abstract class AbstractInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        return preHandle(request);
    }

    protected abstract boolean preHandle(HttpServletRequest request);
}
