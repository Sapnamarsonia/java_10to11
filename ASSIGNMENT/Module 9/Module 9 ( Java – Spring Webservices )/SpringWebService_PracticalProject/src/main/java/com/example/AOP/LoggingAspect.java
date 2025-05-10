package com.example.AOP;

import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    private static final Logger logger = (Logger) LoggerFactory.getLogger(LoggingAspect.class);

    @Before("execution(* com.example.bookstore.service.*.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        logger.info("Started: " + joinPoint.getSignature());
    }

    @AfterReturning("execution(* com.example.bookstore.service.*.*(..))")
    public void logAfter(JoinPoint joinPoint) {
        logger.info("Completed: " + joinPoint.getSignature());
    }
}
