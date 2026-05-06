package AimsProject.hust.soict.dsai.aims.cart;

import AimsProject.hust.soict.dsai.aims.media.Media;
import java.util.ArrayList;

public class Cart {

    private ArrayList<Media> itemsOrdered = new ArrayList<>();

    public void addMedia(Media media) {
        if (!itemsOrdered.contains(media)) {
            itemsOrdered.add(media);
            System.out.println("Added: " + media.getTitle());
        } else {
            System.out.println("Media already exists");
        }
    }

    public void removeMedia(Media media) {
        if (itemsOrdered.contains(media)) {
            itemsOrdered.remove(media);
            System.out.println("Removed: " + media.getTitle());
        } else {
            System.out.println("Not found");
        }
    }

    public float totalCost() {
        float sum = 0;
        for (Media m : itemsOrdered) {
            sum += m.getCost();
        }
        return sum;
    }

    public void printCart() {
        System.out.println("******** CART ********");

        for (Media m : itemsOrdered) {
            System.out.println(m.toString());
        }

        System.out.println("Total cost: " + totalCost());
    }
}