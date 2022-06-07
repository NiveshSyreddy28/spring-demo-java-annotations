package com.zemoso.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {
    public static void main(String[] args) {

        //read spring config file
        AnnotationConfigApplicationContext context = new
                AnnotationConfigApplicationContext(SpringConfig.class);

        //get beans from spring container
        SwimCoach theSwimCoach = context.getBean("swimCoach", SwimCoach.class);

        //call a method on the bean
        System.out.println(theSwimCoach.getDailyWorkout());

        //Call the daily fortune method
        System.out.println(theSwimCoach.getDailyFortune());

        //Call our new methods
        System.out.println("Email: " + theSwimCoach.getEmail());
        System.out.println("Team: " + theSwimCoach.getTeam());
        //close the context
        context.close();
    }
}
