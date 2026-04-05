package Aims2;

public class Aims1 {
    public static void main(String[] args) {

        Cart1 anOrder = new Cart1();

        // Tạo DVD
        DigitalVideoDisc1 dvd1 = new DigitalVideoDisc1(
                "The Lion King", "Animation", "Roger Allers", 87, 19.95f);

        DigitalVideoDisc1 dvd2 = new DigitalVideoDisc1(
                "Star Wars", "Science Fiction", "George Lucas", 124, 24.95f);

        DigitalVideoDisc1 dvd3 = new DigitalVideoDisc1(
                "Aladin", "Animation", 18.99f);

        // Thêm
        anOrder.addDigitalVideoDisc(dvd1);
        anOrder.addDigitalVideoDisc(dvd2);
        anOrder.addDigitalVideoDisc(dvd3);

        // Hiển thị
        anOrder.displayCart();

        // Xóa
        anOrder.removeDigitalVideoDisc(dvd2);

        // Hiển thị lại
        System.out.println("\nAfter removing:");
        anOrder.displayCart();
    }
}