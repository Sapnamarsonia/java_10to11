package com.example.demo.aspect;

import org.aspectj.lang.annotation.*;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.example.demo.service.*.*(..))")
    public void logBefore() {
        System.out.println("👉 [Before] Method execution started");
    }

    @After("execution(* com.example.demo.service.*.*(..))")
    public void logAfter() {
        System.out.println("✅ [After] Method execution completed");
    }

    @Around("execution(* com.example.demo.service.*.*(..))")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        System.out.println("⏳ [Around] Starting method: " + joinPoint.getSignature());
        Object proceed = joinPoint.proceed();
        long duration = System.currentTimeMillis() - start;
        System.out.println("⏱️ [Around] Method executed in: " + duration + " ms");
        return proceed;
    }
}
