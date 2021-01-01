package ru.alishev.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
//    @Autowired  //внедрение зависимости через поле
    private Music music;

    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    private String name;
    private int volume;
    private List<Music> musicList = new ArrayList<>();

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

//    @Autowired  //внедрение зависимости через сеттер
    public void setMusic(Music music) {
        this.music = music;
    }

    @Autowired  //внедрение 2 зависимостей через конструктор
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    public void playMusic() {
//        System.out.println("Playing: " + music.getSong());
        System.out.println("Playing: " + classicalMusic.getSong());
        System.out.println("Playing: " + rockMusic.getSong());
    }

    public String playMusicStr() {
        return "Playing: " + classicalMusic.getSong();
    }

    public void playMusicList() {
        for (Music music : musicList) {
            System.out.println("Playing: " + music.getSong());
        }
    }
}
