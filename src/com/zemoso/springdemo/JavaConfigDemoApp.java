package com.zemoso.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {
    public static void main(String[] args) {

        //read spring config file
        AnnotationConfigApplicationContext context = new
                AnnotationConfigApplicationContext(SpringConfig.class);

        //get beans from spring container
        Coach theTennisCoach = context.getBean("tennisCoach", Coach.class);

        //call a method on the bean
        System.out.println(theTennisCoach.getDailyWorkout());

        //Call the daily fortune method
        System.out.println(theTennisCoach.getDailyFortune());
        //close the context
        context.close();
    }
}
