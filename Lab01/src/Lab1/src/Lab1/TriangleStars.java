package Lab1.src.Lab1;

import java.util.Scanner;

public class TriangleStars {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the height (n): ");
        int n = keyboard.nextInt();

        for (int i = 1; i <= n; i++) {
            int stars = 2 * i - 1;

            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            System.out.println(); // move to next line
        }

        keyboard.close();
    }
}
