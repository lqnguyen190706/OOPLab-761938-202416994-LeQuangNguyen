package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Media {

    private String artist;
    private String director;
    private ArrayList<Track> tracks = new ArrayList<>();

    // Constructor
    public CompactDisc(int id, String title, String category,
                       String artist, String director, float cost) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.artist = artist;
        this.director = director;
        this.cost = cost;
    }

    // Thêm track
    public void addTrack(Track track) {
        tracks.add(track);
    }

    // Tính tổng độ dài CD
    public int getLength() {
        int total = 0;
        for (Track t : tracks) {
            total += t.getLength();
        }
        return total;
    }

    // Hiển thị thông tin CD
    public void displayInfo() {
        System.out.println("CD Title: " + title);
        System.out.println("Category: " + category);
        System.out.println("Artist: " + artist);
        System.out.println("Director: " + director);
        System.out.println("Length: " + getLength());
        System.out.println("Price: " + cost);

        System.out.println("Tracks:");
        for (Track t : tracks) {
            System.out.println("- " + t.getTitle() + " (" + t.getLength() + ")");
        }
    }

    // Play CD
    public void play() {
        if (getLength() <= 0) {
            System.out.println("CD cannot be played (invalid length)");
            return;
        }

        System.out.println("Playing CD: " + title + " (" + getLength() + ")");

        for (Track t : tracks) {
            t.play();
        }
    }
}