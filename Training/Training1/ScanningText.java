package Training1;

import java.util.Scanner;

public class ScanningText {
    public static void main(String[] args) {
        String text =
                "Egetur: 1. seat is reserved by Ahmet Durak at 05.02.2022\n" +
                        "Flixbus: 1. seat is reserved by Ahmet Durak at 05.02.2022\n" +
                        "Aydoganlar: 1. seat is reserved by Ahmet Durak at 05.02.2022\n" +
                        "Has Adana;): 1. seat is reserved by Ahmet Durak at 05.02.2022\n";

        Scanner scanner = new Scanner(text);

        while (scanner.hasNextLine()) {
            String currentLine = scanner.nextLine();
            if (currentLine.contains("Flixbus")) {
                System.out.println(currentLine);
            }
        }
    }
}

