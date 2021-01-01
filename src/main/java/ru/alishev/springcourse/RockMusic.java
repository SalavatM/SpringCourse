package ru.alishev.springcourse;

import org.springframework.stereotype.Component;

@Component("musicBean")
public class RockMusic implements Music{

//    public void doInit() {
//        System.out.println("Doing initialization rock music");
//    }
//
//    public void doDestroy() {
//        System.out.println("Doing destruction rock music");
//    }

    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}
