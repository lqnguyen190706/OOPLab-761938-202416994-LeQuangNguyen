package Lab1.src.Lab1;

import java.util.Scanner;

public class DaysOfMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = 0;
        int year;

        // Nhập tháng
        while (true) {
            System.out.print("Nhập tháng: ");
            String input = sc.nextLine().trim().toLowerCase();

            if (input.equals("january") || input.equals("jan") || input.equals("jan.") || input.equals("1"))
                month = 1;
            else if (input.equals("february") || input.equals("feb") || input.equals("feb.") || input.equals("2"))
                month = 2;
            else if (input.equals("march") || input.equals("mar") || input.equals("mar.") || input.equals("3"))
                month = 3;
            else if (input.equals("april") || input.equals("apr") || input.equals("apr.") || input.equals("4"))
                month = 4;
            else if (input.equals("may") || input.equals("5"))
                month = 5;
            else if (input.equals("june") || input.equals("jun") || input.equals("6"))
                month = 6;
            else if (input.equals("july") || input.equals("jul") || input.equals("7"))
                month = 7;
            else if (input.equals("august") || input.equals("aug") || input.equals("aug.") || input.equals("8"))
                month = 8;
            else if (input.equals("september") || input.equals("sep") || input.equals("sept") || input.equals("sept.") || input.equals("9"))
                month = 9;
            else if (input.equals("october") || input.equals("oct") || input.equals("oct.") || input.equals("10"))
                month = 10;
            else if (input.equals("november") || input.equals("nov") || input.equals("nov.") || input.equals("11"))
                month = 11;
            else if (input.equals("december") || input.equals("dec") || input.equals("dec.") || input.equals("12"))
                month = 12;
            else {
                System.out.println("Tháng không hợp lệ, nhập lại!");
                continue;
            }
            break;
        }

        // Nhập năm
        while (true) {
            System.out.print("Nhập năm: ");
            if (sc.hasNextInt()) {
                year = sc.nextInt();
                if (year >= 0) break;
            } else {
                sc.next(); // bỏ giá trị sai
            }
            System.out.println("Năm không hợp lệ, nhập lại!");
        }

        // Kiểm tra năm nhuận
        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        // Tính số ngày
        int days;
        switch (month) {
            case 2:
                days = isLeap ? 29 : 28;
                break;
            case 4: case 6: case 9: case 11:
                days = 30;
                break;
            default:
                days = 31;
        }

        System.out.println("Số ngày: " + days);
        sc.close();
    }
}
