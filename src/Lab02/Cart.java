package Lab02;

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
        System.out.println("\n----- CART -----");
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println((i+1) + ". " +
                    items[i].getTitle() + " - " + items[i].getCost());
        }
        System.out.println("Total: " + totalCost());
        System.out.println("----------------\n");
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