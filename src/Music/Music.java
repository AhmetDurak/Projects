package Music;
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

//https://studio.youtube.com/channel/UCeLpyfExzuHU203NIWJdzeQ/music

public class Music {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        Scanner scanner = new Scanner(System.in);
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(new File("C:/Users/volka/IdeaProjects/Projects/src/Music/Everything Has a Beginning - Joel Cummins.wav"));
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);

        String response = "";

        while (!response.equals("Q")){
            System.out.println("P = play, S = Stop, R = Reset, Q = Quit");
            System.out.println("Enter your choice: ");

            response = scanner.next();
            response = response.toUpperCase();

            switch (response){
                case "P": clip.start();
                break;
                case "S": clip.stop();
                break;
                case "R": clip.setMicrosecondPosition(0);
                break;
                default:
                    System.out.println("Not a valid response!");
            }
        }
    }

}
