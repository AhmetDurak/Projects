package MyFirstGame;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable {

    //SCREEN SETTINGS
    final int origanalTileSize = 16; // 16x16 tile
    final int scale = 3;

    final int tileSize = origanalTileSize * scale; // 48x48 tile
    final int maxScreenCol = 16;
    final int maxScreenRow = 12;
    final int screenWidth = tileSize * maxScreenCol; // 768 pixels
    final int screenHeight = tileSize * maxScreenRow; // 576 pixels

    // FPS
    double FPS = 60;


    KeyHandler keyH = new KeyHandler();
    Thread gameThread;

    // Set player's default position
    int playerx = 100;
    int playery = 100;
    int playerSpeed = 4;

    public GamePanel(){

        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
        this.addKeyListener(keyH);
        this.setFocusable(true);

    }

    public void startGameThread(){
        gameThread = new Thread(this);

        gameThread.start();
    }



    @Override
    public void run() {

        double drawInteval = 1000000000/ FPS; // 0.16666 seconds
        double nextDrawTime = System.nanoTime() + drawInteval;

        while (gameThread != null){

            long currentTime = System.nanoTime();  //Vidoe 2 24.00

            update();

            repaint();

            // TIME DELAY
            /*try{
                double remainingTime = nextDrawTime - System.nanoTime();
                remainingTime = remainingTime / 1000000;

                if (remainingTime < 0){
                    remainingTime = 0;
                }
                Thread.sleep((long)remainingTime);

                nextDrawTime += drawInteval;

            }catch (InterruptedException e){ e.printStackTrace();}      // Time delay
*/
        }
    }

    public void update(){
        /*if (keyH.upPressed){
            playery -= playerSpeed;
        }else if (keyH.downPressed){
            playery += playerSpeed;
        }else if (keyH.leftPressed){
            playerx += playerSpeed;
        }else if (keyH.rightPressed){
            playerx += playerSpeed;
        }*/

    }

    public void painComponent(Graphics g){ ////YAZDIRMAYI SUAN YAPMIYOR ???????????
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        g2.setColor(Color.white);

        g2.fillRect(playerx, playery,tileSize,tileSize);

        g2.dispose();


    }
}
