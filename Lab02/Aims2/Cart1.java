package Aims2;

public class Cart1 {
    public static final int MAX_NUMBERS_ORDERED = 20;

    private DigitalVideoDisc1[] itemsOrdered = new DigitalVideoDisc1[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0;

    // Thêm DVD
    public void addDigitalVideoDisc(DigitalVideoDisc1 disc) {
        public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
            addDigitalVideoDisc(dvd1);
            addDigitalVideoDisc(dvd2);
        }

        public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
            for (DigitalVideoDisc dvd : dvdList) {
                addDigitalVideoDisc(dvd);
            }
        }

        public void addDigitalVideoDisc(DigitalVideoDisc... dvdList) {
            for (DigitalVideoDisc dvd : dvdList) {
                addDigitalVideoDisc(dvd);
            }
        }
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added");
        } else {
            System.out.println("The cart is almost full");
        }
    }

    // Xóa DVD
    public void removeDigitalVideoDisc(DigitalVideoDisc1 disc) {
        boolean found = false;

        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i] == disc) {
                found = true;

                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }

                itemsOrdered[qtyOrdered - 1] = null;
                qtyOrdered--;

                System.out.println("The disc has been removed");
                break;
            }
        }

        if (!found) {
            System.out.println("The disc was not found");
        }
    }

    // Tổng tiền
    public float totalCost() {
        float total = 0;

        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost();
        }

        return total;
    }

    // Hiển thị
    public void displayCart() {
        System.out.println("***************CART***************");

        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println((i + 1) + ". "
                    + itemsOrdered[i].getTitle() + " - "
                    + itemsOrdered[i].getCost());
        }

        System.out.println("Total cost: " + totalCost());
        System.out.println("**********************************");
    }
}
