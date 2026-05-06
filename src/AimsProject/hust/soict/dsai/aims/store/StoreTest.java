package AimsProject.hust.soict.dsai.aims.store;

import AimsProject.hust.soict.dsai.aims.media.DigitalVideoDisc;

public class StoreTest {

    public static void main(String[] args) {

        Store store = new Store();

        DigitalVideoDisc dvd1 =
                new DigitalVideoDisc("Lion King", "Animation", "Roger", 87, 19.95f);

        DigitalVideoDisc dvd2 =
                new DigitalVideoDisc("Star Wars", "Sci-fi", "George Lucas", 87, 24.95f);

        DigitalVideoDisc dvd3 =
                new DigitalVideoDisc("Aladin", "Animation", "John Musker", 90, 18.99f);

        // Add DVDs
        store.addDVD(dvd1);
        store.addDVD(dvd2);
        store.addDVD(dvd3);

        store.printStore();

        // Remove DVD
        store.removeDVD(dvd2);

        store.printStore();

        // Try remove again (not found case)
        store.removeDVD(dvd2);
    }
}
