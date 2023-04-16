package ua.lviv.iot.algo.part1.lab3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
@ToString
public class Clip extends AbstractVideo {
    private String songTitle;
    private String artist;
    private String label;
    private int likes;
    private int views;

    @Override
    public double getCurrentRating() {
        return (double) likes / views;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSong Title: " + songTitle + "\nArtist: " + artist +
                "\nLabel: " + label + "\nLikes: " + likes + "\nViews: " + views;
    }
}


