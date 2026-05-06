package AimsProject.hust.soict.dsai.aims.store;

import AimsProject.hust.soict.dsai.aims.media.Media;
import java.util.ArrayList;

public class Store {

    private ArrayList<Media> itemsInStore = new ArrayList<>();

    public void addMedia(Media media) {
        itemsInStore.add(media);
        System.out.println("Added to store: " + media.getTitle());
    }

    public void removeMedia(Media media) {
        if (itemsInStore.contains(media)) {
            itemsInStore.remove(media);
            System.out.println("Removed: " + media.getTitle());
        } else {
            System.out.println("Media not found!");
        }
    }

    public void printStore() {
        System.out.println("******** STORE ********");

        for (Media m : itemsInStore) {
            System.out.println(m);
        }

        System.out.println("************************");
    }
}