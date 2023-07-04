package com.Configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = { "com.dailycodebuffer", "com.Aspect" })
@EnableAspectJAutoProxy
public class BeanConfig {

}
