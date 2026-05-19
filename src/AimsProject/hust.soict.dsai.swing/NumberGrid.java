package hust.soict.dsai.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NumberGrid extends JFrame implements ActionListener {

    private JTextField tfDisplay;
    private JButton[] btnNumbers = new JButton[10];
    private JButton btnDel, btnClear;

    public NumberGrid() {

        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());

        tfDisplay = new JTextField();
        cp.add(tfDisplay, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4,3));

        for(int i=1;i<=9;i++){
            btnNumbers[i] = new JButton(i + "");
            btnNumbers[i].addActionListener(this);
            panel.add(btnNumbers[i]);
        }

        btnDel = new JButton("DEL");
        btnDel.addActionListener(this);
        panel.add(btnDel);

        btnNumbers[0] = new JButton("0");
        btnNumbers[0].addActionListener(this);
        panel.add(btnNumbers[0]);

        btnClear = new JButton("C");
        btnClear.addActionListener(this);
        panel.add(btnClear);

        cp.add(panel, BorderLayout.CENTER);

        setTitle("Number Grid");
        setSize(300,300);
        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        for(int i=0;i<=9;i++){
            if(e.getSource() == btnNumbers[i]){
                tfDisplay.setText(tfDisplay.getText() + i);
            }
        }

        if(e.getSource() == btnDel){

            String s = tfDisplay.getText();

            if(s.length() > 0){
                tfDisplay.setText(s.substring(0, s.length()-1));
            }
        }

        if(e.getSource() == btnClear){
            tfDisplay.setText("");
        }
    }

    public static void main(String[] args) {
        new NumberGrid();
    }
}