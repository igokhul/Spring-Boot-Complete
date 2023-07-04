package com.dailycodebuffer;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {

    public void checkout() {
        // Note: Every cross cutting concers we try to solve using AOP is called Aspect
        // Logging
        // Authentication & Authorization
        // Sanitize Data
        System.out.println("Checkout method is called from " + this.getClass().getName());
    }

}