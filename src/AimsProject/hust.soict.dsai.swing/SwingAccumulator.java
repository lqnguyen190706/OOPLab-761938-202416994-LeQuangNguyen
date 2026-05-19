package hust.soict.dsai.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingAccumulator extends JFrame {

    private JTextField tfInput;
    private JTextField tfOutput;
    private int sum = 0;

    public SwingAccumulator() {

        Container cp = getContentPane();
        cp.setLayout(new GridLayout(2,2));

        cp.add(new JLabel("Enter an integer"));

        tfInput = new JTextField(10);
        cp.add(tfInput);

        cp.add(new JLabel("The accumulated sum is"));

        tfOutput = new JTextField(10);
        tfOutput.setEditable(false);
        cp.add(tfOutput);

        tfInput.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int number = Integer.parseInt(tfInput.getText());
                sum += number;

                tfInput.setText("");
                tfOutput.setText(sum + "");
            }
        });

        setTitle("Swing Accumulator");
        setSize(400,150);
        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new SwingAccumulator();
    }
}