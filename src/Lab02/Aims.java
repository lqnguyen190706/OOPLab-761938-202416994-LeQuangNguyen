package Lab02;

public class Aims {
    public static void main(String[] args) {

        Cart cart = new Cart();


        DigitalVideoDisc dvd1 =
                new DigitalVideoDisc("Lion King", "Animation", "Roger", 87, 19.95f);

        DigitalVideoDisc dvd2 =
                new DigitalVideoDisc("Star Wars", "Sci-fi", "George Lucas", 87, 24.95f);

        DigitalVideoDisc dvd3 =
                new DigitalVideoDisc("Aladin", "Animation", 18.99f);


        cart.addDigitalVideoDisc(dvd1);
        cart.addDigitalVideoDisc(dvd2);
        cart.addDigitalVideoDisc(dvd3);

        cart.printCart();


        cart.removeDigitalVideoDisc(dvd2);

        cart.printCart();
        DigitalVideoDisc[] list = {dvd1, dvd2};
        cart.addDigitalVideoDisc(list);

        cart.addDigitalVideoDisc(dvd1, dvd3);
    }

}