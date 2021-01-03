package ru.alishev.springcourse;

import org.springframework.context.annotation.*;

import java.util.Arrays;
import java.util.List;

@Configuration
//@ComponentScan("ru.alishev.springcourse")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    @Scope("prototype")
    public ClassicalMusic classicalMusic() {
        return ClassicalMusic.getClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public TranceMusic tranceMusic() {
        return new TranceMusic();
    }

    @Bean
    public List<Music> musicList() {
        // Этот лист неизменяемый (immutable)
        return Arrays.asList(rockMusic(), tranceMusic());
//        return Arrays.asList(classicalMusic(), rockMusic(), tranceMusic());
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer((musicList()));
    }

    @Bean
    public Computer computer() {
        return new Computer(musicPlayer());
    }
}
