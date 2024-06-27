package com.spring.aop.aopexample.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class CommonPointcut {
    
    @Pointcut("execution(* com.spring.aop.aopexample.*.*.*(..))")
    public void businessPackageConig(){}


    @Pointcut("@annotation(com.spring.aop.aopexample.annotations.TrackTime)")
    public void trackTimeAnnotation (){}
}
