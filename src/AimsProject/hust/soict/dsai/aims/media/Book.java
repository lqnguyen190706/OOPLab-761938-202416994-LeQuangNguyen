package hust.soict.dsai.aims.media;

import java.util.List;

public class Book extends Media {
    private List<String> authors;

    public Book(int id, String title, String category, float cost, List<String> authors) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.authors = authors;
    }

    public void displayInfo() {
        System.out.println("BOOK: " + title);
        System.out.println("Category: " + category);
        System.out.println("Authors: " + authors);
        System.out.println("Length (tokens): " + title.split(" ").length);
    }
}
