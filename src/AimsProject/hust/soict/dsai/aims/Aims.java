package hust.soict.dsai.aims;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class Aims {
    public static void main(String[] args) {

        Cart cart = new Cart();

        DigitalVideoDisc dvd1 =
                new DigitalVideoDisc("Lion King", "Animation", "Roger", 87, 19.95f);

        DigitalVideoDisc dvd2 =
                new DigitalVideoDisc("Star Wars", "Sci-fi", "George Lucas", 87, 24.95f);

        DigitalVideoDisc dvd3 =
                new DigitalVideoDisc("Aladin", "Animation", 18.99f);

        // Add
        cart.addDigitalVideoDisc(dvd1);
        cart.addDigitalVideoDisc(dvd2);
        cart.addDigitalVideoDisc(dvd3);

        // Print
        cart.printCart();

        // Search
        System.out.println("\n--- Search by ID ---");
        cart.searchById(2);

        System.out.println("\n--- Search by Title ---");
        cart.searchByTitle("Star");

        // Remove
        cart.removeDigitalVideoDisc(dvd2);
        cart.printCart();

        // Add multiple
        DigitalVideoDisc[] list = {dvd1, dvd2};
        cart.addDigitalVideoDisc(list);

        cart.addDigitalVideoDisc(dvd1, dvd3);
    }
}