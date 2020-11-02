package com.yangq.selfmotivation.aop;

import cn.hutool.core.util.StrUtil;
import com.yangq.selfmotivation.config.DynamicDataSourceContextHolder;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @Classname DataSourceAspect
 * @Description 数据源切换切面
 * @Date 2020/7/14 11:23 上午
 * @Created by Rui.Zhang
**/
 @Component
 @Aspect
 @Order(-1)
 @Slf4j
public class DataSourceAspect {

    /**
     * 切点
     */
    @Pointcut("@annotation(org.springframework.web.bind.annotation.GetMapping)")
    private void cutController() {
    }

    @Before("cutController()")
    public void before(JoinPoint joinPoint) {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        // 租户标识
        request.getParameter("Site-info");
        String sign =  request.getParameter("Site-info");
        log.info("request site is "+sign);
        if (StrUtil.isNotEmpty(sign)) {
            DynamicDataSourceContextHolder.setDataSource(sign);
        } else {
            DynamicDataSourceContextHolder.clearDataSource();
        }
    }
}
