package Aims;

public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    // Constructor đầy đủ
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }

    // Constructor chỉ title
    public DigitalVideoDisc(String title) {
        this(title, "", "", 0, 0f);
    }

    // Constructor title + category + cost
    public DigitalVideoDisc(String title, String category, float cost) {
        this(title, category, "", 0, cost);
    }

    // Constructor director + category + title + cost
    public DigitalVideoDisc(String director, String category, String title, float cost) {
        this(title, category, director, 0, cost);
    }

    // Getter
    public String getTitle() { return title; }
    public String getCategory() { return category; }
    public String getDirector() { return director; }
    public int getLength() { return length; }
    public float getCost() { return cost; }

    // Hiển thị thông tin DVD
    public void printInfo() {
        System.out.println("Title: " + title + ", Category: " + category + ", Director: " + director
                + ", Length: " + length + " mins, Cost: $" + cost);
    }
}