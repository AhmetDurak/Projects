package Animation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Animation extends JPanel implements ActionListener {
    Timer timer = new Timer(10,this);
    int x = 0, velx = 2;

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        g.setColor(Color.red);
        g.fillRect(x,30,50,50);

        timer.start();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (x < 0 || x > 540)
            velx = - velx;
        x = x + velx;
        repaint();
    }
    public static void main(String[] args) {
        Animation animation = new Animation();
        JFrame frame = new JFrame();
        frame.setTitle("Animation");
        frame.setSize(600,400);
        frame.setResizable(false);

        frame.add(animation);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
