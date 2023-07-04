package com.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logging {

    // We can also write like this
    // @Before("execution(public void com.dailycodebuffer.ShoppingCart.checkout())")
    @Before("execution(* com.dailycodebuffer.ShoppingCart.checkout())")
    public void logging() {
        System.out.println("------------------------\nBefore Loggin from "
                + this.getClass().getName()
                + "\n------------------------");
    }

    // Before logging with parameter
    @Before("execution(* *..checkout(..))")
    public void loggingBeforeWithParameter(JoinPoint joinPoint) {
        
        // joinPoint.getArgs() returns an array of objects
        // Printing the elements of the array
        for(Object obj : joinPoint.getArgs()){
            System.out.println("Parameter value: " + obj.toString());
        }

        System.out.println("------------------------\nBefore logging with parameter from "
                + this.getClass().getName()
                + "\n------------------------");
    }

    // No matter what package or class this method will be called
    // Whatever the number of parameters it'll be called because of
    // .. in checkout(..)
    @After("execution(* *..checkout(..))")
    public void loggingAfter() {
        System.out.println("------------------------\nAfter logging from "
                + this.getClass().getName()
                + "\n------------------------");
    }

}

// Pointcuts can be called from multiple places
// 1. Before
// 2. After
// 3. Around
// 4. AfterThrowing
// 5. AfterReturning