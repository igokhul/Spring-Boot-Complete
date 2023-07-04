package com.Aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Authentication {

    @Pointcut("within(com.dailycodebuffer.*)")
    public void authenticatingPointCut() {
        System.out.println("Authenticating Pointcut");
    }

    @Pointcut("within(com.dailycodebuffer.*)")
    public void authorizationPointCut() {
        System.out.println("Authorization Pointcut");
    }

    @Before("authenticatingPointCut() && authorizationPointCut()")
    public void authenticate(){
        System.out.println("Authenticating...");
    }
}
