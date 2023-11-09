package com.test.aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class UserAspect {


    @Pointcut("execution(* com.test.aop.demo.*.*(..)))")
    public void  pointcut(){

    }


    @Around("pointcut()")
    public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws  Throwable{

        System.out.println(" before .....");
        Object proceed = joinPoint.proceed();
        System.out.println(" after .....");
        return  proceed;

    }
}
