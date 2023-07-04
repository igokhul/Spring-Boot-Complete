package com.dailycodebuffer;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {

    public void checkout() {
        // Note: Every cross cutting concers we try to solve using AOP is called Aspect
        // Logging
        // Authentication & Authorization
        // Sanitize Data
        System.out.println("checkout() method is called from " + this.getClass().getName());
    }

    public void checkout(String string, String string2) {
        System.out.println("Checkout method is called with parameter from " + this.getClass().getName());
    }

}