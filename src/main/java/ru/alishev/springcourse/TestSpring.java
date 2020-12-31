package ru.alishev.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        ClassicalMusic classicalMusic = context.getBean("musicBean", ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());

        RockMusic rockMusic = context.getBean("musicBean2", RockMusic.class);
        System.out.println(rockMusic.getSong());

        TranceMusic tranceMusic = context.getBean("musicBean3", TranceMusic.class);
        System.out.println(tranceMusic.getSong());

        TranceMusic tranceMusic2 = context.getBean("musicBean3", TranceMusic.class);
        System.out.println(tranceMusic2.getSong());

//        Music music = context.getBean("musicBean", Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);

//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);
//
//        boolean comparison = musicPlayer == musicPlayer2;
//        System.out.println(comparison);
//
//        System.out.println(musicPlayer);
//        System.out.println(musicPlayer2);
//
//        musicPlayer.setVolume(10);

        //musicPlayer.playMusic();

        //System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());
//        System.out.println(musicPlayer2.getVolume());

        context.close();
    }
}
