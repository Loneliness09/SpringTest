package com.iflytek;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {
    @Pointcut("execution(* com.iflytek.service..*(..))")
    public void cut() {
    }

    @Before("execution(* com.iflytek.service..*(..))")
    public void before() {
        System.out.println("check1.");
    }
}
