package ru.alishev.springcourse;

import java.util.ArrayList;
import java.util.List;

public class TranceMusic implements Music {

    private List<String> songs = new ArrayList<>();

    public void doInit() {
        System.out.println("Doing initialization trance music");
    }

    public void doDestroy() {
        System.out.println("Doing destruction trance music");
    }

    @Override
    public String getSong() {
        return "All For Love";
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }

}
