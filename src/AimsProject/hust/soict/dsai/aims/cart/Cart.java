package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class Cart {
    public static final int MAX = 20;
    private DigitalVideoDisc[] items = new DigitalVideoDisc[MAX];
    private int qtyOrdered = 0;


    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX) {
            items[qtyOrdered++] = disc;
            System.out.println("Added: " + disc.getTitle());
        } else {
            System.out.println("Cart is full");
        }
    }


    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (items[i] == disc) {
                for (int j = i; j < qtyOrdered - 1; j++) {
                    items[j] = items[j + 1];
                }
                items[--qtyOrdered] = null;
                System.out.println("Removed: " + disc.getTitle());
                return;
            }
        }
        System.out.println("Not found");
    }


    public float totalCost() {
        float sum = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            sum += items[i].getCost();
        }
        return sum;
    }


    public void printCart() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");

        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println((i + 1) + ". " + items[i].toString());
        }

        System.out.println("Total cost: " + totalCost() + " $");
        System.out.println("***************************************************");
    }


    public void searchById(int id) {
        boolean found = false;

        for (int i = 0; i < qtyOrdered; i++) {
            if (items[i].getId() == id) {
                System.out.println("Found: " + items[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy DVD với ID: " + id);
        }
    }


    public void searchByTitle(String title) {
        boolean found = false;

        for (int i = 0; i < qtyOrdered; i++) {
            if (items[i].isMatch(title)) {
                System.out.println("Found: " + items[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy DVD với tiêu đề: " + title);
        }
    }


    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        addDigitalVideoDisc(dvd1);
        addDigitalVideoDisc(dvd2);
    }

    public void addDigitalVideoDisc(DigitalVideoDisc... dvdList) {
        for (DigitalVideoDisc dvd : dvdList) {
            addDigitalVideoDisc(dvd);
        }
    }
}