package Lab02;

public class DigitalVideoDisc {

    // Class member (dùng chung)
    private static int nbDigitalVideoDiscs = 0;

    // Instance member
    private int id;

    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    // Constructor 1
    public DigitalVideoDisc(String title) {
        this.title = title;
        updateId();
    }

    // Constructor 2
    public DigitalVideoDisc(String category, String title, float cost) {
        this.category = category;
        this.title = title;
        this.cost = cost;
        updateId();
    }

    // Constructor 3
    public DigitalVideoDisc(String director, String category, String title, float cost) {
        this.director = director;
        this.category = category;
        this.title = title;
        this.cost = cost;
        updateId();
    }

    // Constructor 4
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        updateId();
    }

    // Hàm cập nhật id
    private void updateId() {
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    // Getter
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
}