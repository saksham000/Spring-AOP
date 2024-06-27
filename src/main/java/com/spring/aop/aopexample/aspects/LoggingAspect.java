package com.spring.aop.aopexample.aspects;

import org.slf4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class LoggingAspect {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Pointcut("execution(* com.spring.aop.aopexample.business.*.*(..))")
    public void logMethodCall(JoinPoint joinPoint) {
        logger.info("Logging method call");
    }

}
