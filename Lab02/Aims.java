public class Aims {
    public static void main(String[] args) {

        DigitalVideoDisc dvd1 =
                new DigitalVideoDisc("Lion King", "Animation", "Roger", 87, 19.95f);

        System.out.println("Title: " + dvd1.getTitle());
        System.out.println("Cost: " + dvd1.getCost());
    }
}