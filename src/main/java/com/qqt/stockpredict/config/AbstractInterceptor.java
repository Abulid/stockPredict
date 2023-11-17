package com.qqt.stockpredict.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author QQtang
 */
public abstract class AbstractInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        return preHandle(request);
    }

    protected abstract boolean preHandle(HttpServletRequest request);
}
