package Aims;

import java.util.ArrayList;

public class Cart {
    // items private, không cho truy cập trực tiếp từ ngoài
    private ArrayList<DigitalVideoDisc> items = new ArrayList<>();

    // Thêm DVD vào giỏ
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (items.size() < 20) { // Giới hạn 20 DVD
            items.add(disc);
            System.out.println("Added: " + disc.getTitle());
        } else {
            System.out.println("Cart full! Cannot add more DVDs.");
        }
    }

    // Xóa DVD theo tên
    public void removeDigitalVideoDisc(String title) {
        boolean found = false;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getTitle().equals(title)) {
                items.remove(i);
                System.out.println("Removed: " + title);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("DVD not found in cart!");
        }
    }

    // Tính tổng tiền
    public float totalCost() {
        float total = 0;
        for (DigitalVideoDisc d : items) {
            total += d.getCost();
        }
        return total;
    }

    // Hiển thị toàn bộ giỏ hàng
    public void showCart() {
        System.out.println("\nYour cart contains:");
        for (int i = 0; i < items.size(); i++) {
            System.out.print((i + 1) + ". ");
            items.get(i).printInfo();
        }
        System.out.println("Total cost: $" + totalCost() + "\n");
    }
}