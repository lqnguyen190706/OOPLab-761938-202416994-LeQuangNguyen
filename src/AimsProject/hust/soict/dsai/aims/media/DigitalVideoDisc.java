package hust.soict.dsai.aims.media;

public class DigitalVideoDisc {

    private static int nbDigitalVideoDiscs = 0;

    private int id;
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    public DigitalVideoDisc(String title) {
        this.title = title;
        updateId();
    }

    public DigitalVideoDisc(String category, String title, float cost) {
        this.category = category;
        this.title = title;
        this.cost = cost;
        updateId();
    }

    public DigitalVideoDisc(String director, String category, String title, float cost) {
        this.director = director;
        this.category = category;
        this.title = title;
        this.cost = cost;
        updateId();
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        updateId();
    }

    private void updateId() {
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public float getCost() {
        return cost;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String toString() {
        return "DVD - " + (title != null ? title : "Unknown") + " - "
                + (category != null ? category : "Unknown") + " - "
                + (director != null ? director : "Unknown") + " - "
                + length + ": " + cost + " $";
    }

    public boolean isMatch(String keyword) {
        if (title == null || keyword == null) return false;
        return title.toLowerCase().contains(keyword.toLowerCase());
    }

    public void play() {
        if (length <= 0) {
            System.out.println("DVD cannot be played: invalid length");
        } else {
            System.out.println("Playing DVD: " + title + " (" + length + ")");
        }
    }
}