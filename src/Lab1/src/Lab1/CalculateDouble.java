package Lab1.src.Lab1;

import javax.swing.JOptionPane;

public class CalculateDouble {
    public static void main(String[] args) {

        String strNum1, strNum2;
        double num1, num2;

        // nhập số
        strNum1 = JOptionPane.showInputDialog("Enter first number:");
        strNum2 = JOptionPane.showInputDialog("Enter second number:");

        // convert String -> double
        num1 = Double.parseDouble(strNum1);
        num2 = Double.parseDouble(strNum2);

        // tính toán
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;

        String result;

        // kiểm tra chia cho 0
        if (num2 != 0) {
            double quotient = num1 / num2;
            result = "Sum: " + sum +
                     "\nDifference: " + difference +
                     "\nProduct: " + product +
                     "\nQuotient: " + quotient;
        } else {
            result = "Sum: " + sum +
                     "\nDifference: " + difference +
                     "\nProduct: " + product +
                     "\nCannot divide by 0";
        }

        JOptionPane.showMessageDialog(null, result);

        System.exit(0);
    }
}
