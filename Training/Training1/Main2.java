package Training1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) throws FileNotFoundException {
        String text = "";
        Scanner scanner = new Scanner(new File("C:/Users/volka/Desktop/sample.txt"));
        while (scanner.hasNextLine()){
            text = text.concat(scanner.nextLine());
        }
        System.out.println(text);
    }
}



