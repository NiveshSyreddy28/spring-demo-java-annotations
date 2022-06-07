package com.zemoso.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

//@Component("myTennisCoach")
@Component
//@Scope("prototype")
public class TennisCoach implements Coach{

    @Autowired
    @Qualifier("randomFortuneService")
    FortuneService fortuneService;

//    @Autowired
//    public TennisCoach(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }

//    @Autowired
//    public void setFortuneService(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }

//    @Autowired
//    public void customMethod(){
//        System.out.println("Inside the custom method");
//    }

    @PostConstruct
    public void customInitMethod(){
        System.out.println("Inside the custom Init method");
    }

    @PreDestroy
    public void customDestroyMethod(){
        System.out.println("Inside the custom Destroy Method");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand valley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
