package Aims2;

public class DigitalVideoDisc1 {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;



    public DigitalVideoDisc1(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }
    public DigitalVideoDisc(String title) {
        this.title = title;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc1(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    // Getter
    public String getTitle() {
        return title;
    }

    public float getCost() {
        return cost;
    }
}
