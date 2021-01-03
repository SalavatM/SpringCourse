package ru.alishev.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//@Component
public class MusicPlayer {
//    @Autowired  //внедрение зависимости через поле
//    @Qualifier("classicalMusic")
    private Music music;
    private Music music2;

    @Value("${musicPlayer.name}")   //внедрение значения из файла конфигурации
    private String name;

    @Value("${musicPlayer.volume}") //внедрение значения из файла конфигурации
    private int volume;

    private List<Music> musicList = new ArrayList<>();

    //@Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music music, @Qualifier("rockMusic") Music music2) {
        this.music = music;
        this.music2 = music2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public MusicPlayer() {}

    //IoC
//    @Autowired  //внедрение зависимости через конструктор
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

//    @Autowired  //внедрение зависимости через сеттер
    public void setMusic(Music music) {
        this.music = music;
    }

//    @Autowired  //внедрение 2 зависимостей через конструктор
//    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
//        this.classicalMusic = classicalMusic;
//        this.rockMusic = rockMusic;
//    }

    public void playMusic(MusicGenre genre) {
        Random random = new Random();

        // случайное целое число между 0 и 2
        int randomNumber = random.nextInt(3);

        if (genre == MusicGenre.CLASSICAL) {
            // случайная классическая песня
            System.out.println(music.getSongs().get(randomNumber));
        } else {
            // случайная рок песня
            System.out.println(music2.getSongs().get(randomNumber));
        }

//        System.out.println("Playing: " + music.getSong());
//        System.out.println("Playing: " + classicalMusic.getSong());
//        System.out.println("Playing: " + rockMusic.getSong());
    }

    public String playMusicStr() {
        Random random = new Random();

        return "Playing: " + musicList.get(random.nextInt(musicList.size())).getSong()
                + " with volume " + this.volume;
        //return "Playing: " + music.getSong() + ", " + music2.getSong();
    }

    public void playMusicList() {
        for (Music music : musicList) {
            System.out.println("Playing: " + music.getSong());
        }
    }
}
