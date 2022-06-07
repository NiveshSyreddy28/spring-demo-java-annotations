package com.zemoso.springdemo;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService{

    //create an array of quotes
    private String[] fortunes = {"Fortunes favours the brave",
            "Today is your lucky day",
            "Do or die",
            "Winners never quit"};

    //Create a random number generator
    Random random = new Random();

    @Override
    public String getFortune() {
        //pick a random quote from the array
        int index = random.nextInt(fortunes.length);

        return fortunes[index];
    }
}
