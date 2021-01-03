package ru.alishev.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {

    private List<String> songs = new ArrayList<>();

    {
        songs.add("Wind cries Mary");
        songs.add("Summertime");
        songs.add("We are the champions");
    }


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

    @Override
    public List<String> getSongs() {
        return songs;
    }
}
