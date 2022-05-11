package SchoolMS2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static SchoolMS2.School.*;

public class Menu {
    Menu() {
        library();
        logDownload();

    }

    public static void main(String[] args) {
        Student student = new Student();
        Admin admin = new Admin();



    }


    void library(){
        Scanner readFile = null;
        try {
            readFile = new Scanner(new File(path));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int count = 1;
        while (readFile.hasNextLine()) {
            String book = readFile.nextLine();
            try {
                if (book.substring(0, 3).contains("" + count)) {
                    bookList.add(book.substring(book.indexOf(".") + 2));
                    count++;
                }
            } catch (StringIndexOutOfBoundsException ignored) {
            }
        }
    }

    void logDownload() {

    }
}
