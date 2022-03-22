package PasswordValidation.SellTicket;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame implements ActionListener {
    JPanel panel;
    JLabel label;
    JTextField textField;
    JButton busButton, airButton, trainButton;
    JScrollBar scrollBar;

    private JButton[] vehicles = new JButton[3];
    GUI(){
        this.setTitle("Travel");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setLocation(800,10);
        this.setSize(500,1000);



        panel = new JPanel();
        panel.setBounds(30,30,430,200);
        panel.setLayout(new GridLayout(1,3,50,50));
        panel.setBackground(Color.gray);

        scrollBar = new JScrollBar();
        scrollBar.setBounds(465,0, 20, 1500);
        this.add(scrollBar);



        busButton = new JButton("Bus");
        busButton.setBounds(40,50,100,100);
        busButton.setFocusable(false);
        busButton.addActionListener(this);

        airButton = new JButton("Airlines");
        airButton.setBounds(190,50,100,100);
        airButton.setFocusable(false);
        airButton.addActionListener(this);

        trainButton = new JButton("Train");
        trainButton.setBounds(340,50,100,100);
        trainButton.setFocusable(false);
        trainButton.addActionListener(this);





        this.add(panel);
        this.add(trainButton);
        this.add(busButton);
        this.add(airButton);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }


    public static void main(String[] args) {
        new GUI();
    }
}
