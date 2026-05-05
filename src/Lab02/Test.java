package Lab02;

public class Test {
    public static void main(String[] args) {

        Cart cart = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("A", "Cat1", "Dir1", 100, 10f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("B", "Cat2", "Dir2", 120, 20f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("C", "Cat3", "Dir3", 90, 15f);

        // test add 1
        cart.addDigitalVideoDisc(dvd1);

        // test add 2
        cart.addDigitalVideoDisc(dvd2, dvd3);

        // test varargs
        cart.addDigitalVideoDisc(dvd1, dvd2, dvd3);

        // in cart
        cart.printCart();
    }
}