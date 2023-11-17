package com.qqt.stockpredict.config;

import com.google.common.util.concurrent.RateLimiter;
import com.qqt.stockpredict.common.ErrorCode;
import com.qqt.stockpredict.exception.BusinessException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @author qqt
 * @date 2023/9/14 17:11
 */
@Component
@Slf4j
public class RateLimitInterceptor extends AbstractInterceptor {

    public static final int REQUEST_COUNT = 3;

    private static final RateLimiter rateLimiter = RateLimiter.create(REQUEST_COUNT);

    @Override
    protected boolean preHandle(HttpServletRequest request) {
        if (!rateLimiter.tryAcquire()) {
            log.warn(request.getSession().getAttribute("user_id") + "访问频繁");
            throw new BusinessException(ErrorCode.SYSTEM_ERROR,"访问过于频繁");
        }
        return true;
    }
}
