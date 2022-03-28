package Others.Snake;

import javax.swing.*;

public class SnakeGame extends JFrame {
    SnakeGame() {
        this.add(new GamePanel());
        this.setTitle("Others/Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new SnakeGame();
    }
}


