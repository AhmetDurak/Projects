package SchoolMS2;

import java.util.ArrayList;

public class School {
    static String path = "C:/Users/volka//IdeaProjects/Projects/Project/SchoolMS2/BookList.txt";
    static ArrayList<String> bookList = new ArrayList<>();

    void showBookList() {
        int counter = 1;
        for (String element : bookList) {
            System.out.println(counter++ + ". " + element);
        }
    }

}
