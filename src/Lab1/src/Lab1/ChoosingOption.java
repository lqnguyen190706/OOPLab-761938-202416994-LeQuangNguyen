import javax.swing.JOptionPane;

public class ChoosingOption {
    public static void main(String[] args) {
        int option = JOptionPane.showConfirmDialog(
                null,
                "Bạn có muốn tiếp tục không?",
                "Lựa chọn",
                JOptionPane.YES_NO_CANCEL_OPTION
        );

        System.out.println("Bạn chọn: " + option);
    }
}
