package ru.alishev.springcourse;

public class TranceMusic implements Music {

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
}
