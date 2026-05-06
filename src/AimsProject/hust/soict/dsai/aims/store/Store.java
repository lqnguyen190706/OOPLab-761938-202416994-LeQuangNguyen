package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class Store {

    private static final int MAX_ITEMS = 100;
    private DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[MAX_ITEMS];
    private int qtyInStore = 0;


    public void addDVD(DigitalVideoDisc dvd) {
        if (qtyInStore < MAX_ITEMS) {
            itemsInStore[qtyInStore++] = dvd;
            System.out.println("Added to store: " + dvd.getTitle());
        } else {
            System.out.println("Store is full!");
        }
    }


    public void removeDVD(DigitalVideoDisc dvd) {
        boolean found = false;

        for (int i = 0; i < qtyInStore; i++) {
            if (itemsInStore[i] == dvd) {
                found = true;


                for (int j = i; j < qtyInStore - 1; j++) {
                    itemsInStore[j] = itemsInStore[j + 1];
                }

                itemsInStore[--qtyInStore] = null;

                System.out.println("Removed from store: " + dvd.getTitle());
                return;
            }
        }

        if (!found) {
            System.out.println("DVD not found in store!");
        }
    }


    public void printStore() {
        System.out.println("************ STORE ************");

        for (int i = 0; i < qtyInStore; i++) {
            System.out.println((i + 1) + ". " + itemsInStore[i]);
        }

        System.out.println("*******************************");
    }
}
