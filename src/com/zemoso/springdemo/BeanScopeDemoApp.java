package com.zemoso.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {

        //Load Spring config file
        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean from Spring Container
        Coach myCoach = context.getBean("tennisCoach",Coach.class);

        Coach yourCoach = context.getBean("tennisCoach", Coach.class);

        //Check if both the objects are pointing to the same bean
        boolean result = (myCoach == yourCoach);

        //Printing the result and address of the objects
        System.out.println("Both the objects pointing to the same bean: "+result);
        System.out.println("Memory Location of myCoach: "+myCoach);
        System.out.println("Memory location of yourCoach: "+yourCoach);

        //close the context
        context.close();

    }
}
