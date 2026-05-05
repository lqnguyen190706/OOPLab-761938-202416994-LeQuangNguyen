package Lab02;

public class TestPassingParameter {

    public static void swap(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        DigitalVideoDisc temp = dvd1;
        dvd1 = dvd2;
        dvd2 = temp;
    }

    public static void changeTitle(DigitalVideoDisc dvd, String title) {
        dvd.setTitle(title);
    }

    public static void main(String[] args) {

        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

        System.out.println("Before swap:");
        System.out.println(jungleDVD.getTitle());
        System.out.println(cinderellaDVD.getTitle());

        swap(jungleDVD, cinderellaDVD);

        System.out.println("\nAfter swap:");
        System.out.println(jungleDVD.getTitle());
        System.out.println(cinderellaDVD.getTitle());

        changeTitle(jungleDVD, cinderellaDVD.getTitle());

        System.out.println("\nAfter change title:");
        System.out.println(jungleDVD.getTitle());
    }
}