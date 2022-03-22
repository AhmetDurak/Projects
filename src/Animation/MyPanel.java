package Animation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel implements ActionListener {

    final int PANEL_WIDTH = 500;
    final int PANEL_HEIGHT = 500;

    Image midoriya;
    double imageResize = 2;
    final double xImage = 492d;
    final double yImage = 825d;

    Image backgroundImage;

    Timer timer;
    int xVelocity = 1;
    int yVelocity = 1;
    int x = 0;
    int y = 0;


    MyPanel() {
        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        this.setBackground(Color.black);
        midoriya = new ImageIcon("C:/Users/volka/IdeaProjects/Projects/src/Animation/midoriya.png").getImage();
        timer = new Timer(10, this);
        timer.start();      // and actionPerformed runs...


    }

    public void paint(Graphics g) {
        super.paint(g);                 // Paint background

        Graphics2D g2D = (Graphics2D) g;
        g2D.drawImage(midoriya, x, y, (int) (xImage * (imageResize / 10)), (int) (yImage * (imageResize / 10)), null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (x >= PANEL_WIDTH - 50) {
            xVelocity = -xVelocity;
        }else if (x < 0){
            xVelocity = -xVelocity;
        }
        x = x + xVelocity;
        repaint();
    }
}
