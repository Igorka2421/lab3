package ua.lviv.iot.algo.part1.lab3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
@ToString (of = {})

public class VideoManager {
    public static void main(String[] args) {
        List<VideoManager> videos = new ArrayList<>();

        Film film = new Film("The Godfather", "Francis Ford Coppola", 1972, 175, 9);
        videos.add(film);

        Clip clip = new Clip("Despacito", "Carlos Perez", "Lalola", 21312, 32312);
        videos.add(clip);

        for (VideoManager video : videos) {
            System.out.println(video.toString());
        }
    }
}

