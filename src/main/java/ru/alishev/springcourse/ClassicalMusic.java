package ru.alishev.springcourse;

public class ClassicalMusic implements Music {

    private ClassicalMusic() {}

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    public void doInit() {
        System.out.println("Doing initialization classical music");
    }

    public void doDestroy() {
        System.out.println("Doing destruction classical music");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
