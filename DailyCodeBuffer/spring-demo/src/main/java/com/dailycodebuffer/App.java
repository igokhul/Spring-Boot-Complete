package com.dailycodebuffer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class App {
    public static void main(String[] args) {
        // ApplicationContext context = new
        // ClassPathXmlApplicationContext("spring.xml");

        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

        Doctor doctor = context.getBean(Doctor.class);
        // doctor.setQualification("MBBS");
        doctor.assist();

        // Nurse nurse = (Nurse) context.getBean("nurse");
        // nurse.assist();

        Staff staff = (Staff) context.getBean(Nurse.class);
        staff.assist();

        Doctor doctor1 = context.getBean(Doctor.class);
        doctor1.setQualification("MD");

        System.out.println(doctor);
        System.out.println(doctor1);

    }
}

// Five different scope of beans
// 1. Singleton (Default) - Only one reference is created for the whole app
// 2. Prototype - A new reference is created each time the bean is called
// 3. Request - A new instance for each HTTP request
// 4. Session - A new instance for each HTTP session
// 5. Global Session - A new instance for each global HTTP session
