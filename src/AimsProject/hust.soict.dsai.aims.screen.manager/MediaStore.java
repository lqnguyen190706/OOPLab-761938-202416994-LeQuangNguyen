package hust.soict.dsai.aims.screen.manager;

import javax.swing.*;
import java.awt.*;

public class MediaStore extends JPanel {

    public MediaStore(String title, String cost){

        setLayout(new GridLayout(3,1));

        add(new JLabel(title));

        add(new JLabel(cost));

        JButton btnPlay = new JButton("Play");

        add(btnPlay);
    }
}