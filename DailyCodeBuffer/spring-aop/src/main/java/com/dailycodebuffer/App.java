package com.dailycodebuffer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Configuration.BeanConfig;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

        ShoppingCart cart = context.getBean(ShoppingCart.class);
        // cart.checkout();

        cart.checkout("Hello World", "Hello World 2");

        
        ((AnnotationConfigApplicationContext) context).close();
    }
}
