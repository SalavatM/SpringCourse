package ru.alishev.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {

    private List<String> songs = new ArrayList<>();

    {
        songs.add("Hungarian Rhapsody");
        songs.add("The Seasons");
        songs.add("Spring");
    }

    private ClassicalMusic() {}

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

//    public void doInit() {
//        System.out.println("Doing initialization classical music");
//    }
//
//    public void doDestroy() {
//        System.out.println("Doing destruction classical music");
//    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }

}
