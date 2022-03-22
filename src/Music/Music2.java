package Music;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Music2 {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
       Music3();
    }

    public static void Music3() throws LineUnavailableException, UnsupportedAudioFileException, IOException {
        Clip clip = AudioSystem.getClip();
        clip.open(AudioSystem.getAudioInputStream(new File("C:/Users/volka/IdeaProjects/Projects/src/Music/Everything Has a Beginning - Joel Cummins.wav")));
        clip.start();
        String b = new Scanner(System.in).next();
    }
}

