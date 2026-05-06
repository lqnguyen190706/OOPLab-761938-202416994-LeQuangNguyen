
package hust.soict.dsai.aims.media;

public class Track {

    private String title;
    private int length;

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    public void play() {
        if (length <= 0) {
            System.out.println("Track cannot be played: " + title);
        } else {
            System.out.println("Playing track: " + title + " (" + length + ")");
        }
    }
}
