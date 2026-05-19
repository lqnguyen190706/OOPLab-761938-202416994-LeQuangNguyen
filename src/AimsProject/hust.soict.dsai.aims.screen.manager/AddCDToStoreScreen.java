package hust.soict.dsai.aims.screen.manager;

import javax.swing.*;
import java.awt.*;

public class AddCDToStoreScreen extends JFrame {

    public AddCDToStoreScreen(){

        Container cp = getContentPane();

        cp.setLayout(new GridLayout(3,2));

        cp.add(new JLabel("Title"));

        cp.add(new JTextField());

        cp.add(new JLabel("Cost"));

        cp.add(new JTextField());

        JButton btn = new JButton("Add CD");

        cp.add(btn);

        setTitle("Add CD");

        setSize(300,200);

        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}