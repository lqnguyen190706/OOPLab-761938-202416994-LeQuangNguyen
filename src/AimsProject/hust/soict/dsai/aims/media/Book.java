package AimsProject.hust.soict.dsai.aims.media;

import java.util.List;
import java.util.ArrayList;

public class Book extends Media {

    private List<String> authors;

    public Book(int id, String title, String category, float cost, List<String> authors) {
        super(id, title, category, cost);
        this.authors = (authors != null) ? authors : new ArrayList<>();
    }

    public void addAuthor(String authorName) {
        if (!authors.contains(authorName)) {
            authors.add(authorName);
        }
    }

    public void removeAuthor(String authorName) {
        if (authors.contains(authorName)) {
            authors.remove(authorName);
        }
    }

    public void displayInfo() {
        System.out.println("BOOK: " + getTitle());
        System.out.println("Category: " + getCategory());
        System.out.println("Authors: " + authors);
    }
}