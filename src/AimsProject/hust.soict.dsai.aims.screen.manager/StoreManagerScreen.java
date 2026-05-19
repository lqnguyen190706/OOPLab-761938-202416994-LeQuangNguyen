package hust.soict.dsai.aims.screen.manager;

import javax.swing.*;
import java.awt.*;

public class StoreManagerScreen extends JFrame {

    public StoreManagerScreen() {

        Container cp = getContentPane();

        cp.setLayout(new BorderLayout());

        JLabel title = new JLabel("AIMS STORE");

        title.setHorizontalAlignment(JLabel.CENTER);

        cp.add(title, BorderLayout.NORTH);

        JPanel center = new JPanel();

        center.setLayout(new GridLayout(3,3));

        for(int i=1;i<=9;i++){
            center.add(new JButton("Media " + i));
        }

        cp.add(center, BorderLayout.CENTER);

        setTitle("Store");
        setSize(600,400);
        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new StoreManagerScreen();
    }
}
JMenuItem addCD = new JMenuItem("Add CD");

JMenuItem addDVD = new JMenuItem("Add DVD");