package com.example.demo.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    // Logs execution time
    @Around("execution(* com.example.demo.service.*.*(..))")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();

        Object result = joinPoint.proceed();  // Executes the method

        long end = System.currentTimeMillis();

        System.out.println(joinPoint.getSignature() + " executed in " + (end - start) + "ms");

        return result;
    }

    // Logs before execution
    @Before("execution(* com.example.demo.service.*.*(..))")
    public void logBefore() {
        System.out.println("🔔 Method is about to execute...");
    }

    // Logs after execution
    @After("execution(* com.example.demo.service.*.*(..))")
    public void logAfter() {
        System.out.println("✅ Method execution completed.");
    }
}
