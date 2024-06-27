package com.spring.aop.aopexample.aspects;

import org.slf4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class LoggingAspect {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Before("com.spring.aop.aopexample.aspects.CommonPointcut.businessPackageConig()")
    public void logMethodCallBeforeExecution(JoinPoint joinPoint) {
        logger.info("Before Aspect {} is called with arg: {}"

                , joinPoint, joinPoint.getArgs());
    }

    @After("execution(* com.spring.aop.aopexample.*.*.*(..))")
    public void logMethodCallAfterExection(JoinPoint joinPoint) {
        logger.info("After Aspect {} has Executed", joinPoint);
    }

    @AfterThrowing(pointcut = "execution(* com.spring.aop.aopexample.*.*.*(..))", throwing = "exception")
    public void logMethodCallAfterExecption(JoinPoint joinPoint, Exception exception) {
        logger.info("AfterThrowing Aspect {} has thrown a exception - {}", joinPoint, exception);
    }

    @AfterReturning(pointcut = "execution(* com.spring.aop.aopexample.*.*.*(..))",
     returning = "resultValue")
    public void logMethodCallAfterSuccessFullExecution(JoinPoint joinPoint, Object resultValue) {
        logger.info("AfterReturning Aspect {} has returned - {}", joinPoint, resultValue);
    }

}
