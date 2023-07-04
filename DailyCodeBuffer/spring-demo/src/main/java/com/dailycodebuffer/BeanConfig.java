package com.dailycodebuffer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.dailycodebuffer")
public class BeanConfig {

    // @Bean
    // public Doctor doctor(){
    //     Doctor doctor = new Doctor();
    //     doctor.setQualification("MBBS");
    //     return doctor;
    // }

    @Bean
    public Nurse nurse(){
        return new Nurse();
    }
    
}
