package Aims;

import java.util.Scanner;

public class Aims {
    public static void main(String[] args) {
        Cart cart = new Cart(); // Tạo giỏ hàng
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("=== AIMS Menu ===");
            System.out.println("1. Add DVD to cart");
            System.out.println("2. Remove DVD from cart");
            System.out.println("3. Show cart");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine(); // Đọc newline còn dư

            switch (choice) {
                case 1:
                    // Thêm DVD
                    System.out.print("Enter title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter category: ");
                    String category = sc.nextLine();
                    System.out.print("Enter director: ");
                    String director = sc.nextLine();
                    System.out.print("Enter length (minutes): ");
                    int length = sc.nextInt();
                    System.out.print("Enter cost ($): ");
                    float cost = sc.nextFloat();
                    sc.nextLine(); // đọc newline
                    // Thêm vào cart
                    cart.addDigitalVideoDisc(new DigitalVideoDisc(title, category, director, length, cost));
                    break;

                case 2:
                    // Xóa DVD theo tên
                    System.out.print("Enter title to remove: ");
                    String removeTitle = sc.nextLine();
                    cart.removeDigitalVideoDisc(removeTitle);
                    break;

                case 3:
                    // Hiển thị giỏ hàng
                    cart.showCart();
                    break;

                case 4:
                    exit = true;
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }

        sc.close();
    }
}