package com.zemoso.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsDemoApp {
    public static void main(String[] args) {

        //read spring config file
        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("applicationContext.xml");

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
