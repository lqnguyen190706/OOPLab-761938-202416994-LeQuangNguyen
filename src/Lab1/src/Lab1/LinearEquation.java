package Lab1.src.Lab1;

import javax.swing.JOptionPane;

public class LinearEquation {
    public static void main(String[] args) {

        String strA, strB;
        double a, b;

        strA = JOptionPane.showInputDialog("Enter a:");
        strB = JOptionPane.showInputDialog("Enter b:");

        a = Double.parseDouble(strA);
        b = Double.parseDouble(strB);

        String result;

        if (a == 0) {
            if (b == 0) {
                result = "Infinite solutions";
            } else {
                result = "No solution";
            }
        } else {
            double x = -b / a;
            result = "Solution x = " + x;
        }

        JOptionPane.showMessageDialog(null, result);

        System.exit(0);
    }
}
