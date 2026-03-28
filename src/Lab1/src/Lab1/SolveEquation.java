import javax.swing.JOptionPane;

public class SolveEquation {
    public static void main(String[] args) {

        double a, b, c;
        String strA, strB, strC;

        strA = JOptionPane.showInputDialog("Enter a:");
        strB = JOptionPane.showInputDialog("Enter b:");
        strC = JOptionPane.showInputDialog("Enter c:");

        a = Double.parseDouble(strA);
        b = Double.parseDouble(strB);
        c = Double.parseDouble(strC);

        String result;

        // nếu a = 0 -> bậc nhất
        if (a == 0) {
            if (b == 0) {
                if (c == 0)
                    result = "Infinite solutions";
                else
                    result = "No solution";
            } else {
                double x = -c / b;
                result = "x = " + x;
            }
        } else {
            double delta = b * b - 4 * a * c;

            if (delta < 0) {
                result = "No real solution";
            } else if (delta == 0) {
                double x = -b / (2 * a);
                result = "Double root x = " + x;
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                result = "x1 = " + x1 + "\nx2 = " + x2;
            }
        }

        JOptionPane.showMessageDialog(null, result);
        System.exit(0);
    }
}
