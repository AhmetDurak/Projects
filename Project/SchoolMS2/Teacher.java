package SchoolMS2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Teacher extends Student{
    Scanner scanner = new Scanner(System.in);









   /* void addGrade(){
        ArrayList<SchoolMS.Student> list = new ArrayList<>();
        for (String user : studentList.keySet()) {
            int count = Integer.parseInt(String.valueOf(studentList.get(user).schoolNumber.charAt(3)));
            list.add(count-1, studentList.get(user));
        }
        int count = 1;
        for (SchoolMS.Student user: list){
            System.out.println(count++ + ". " + user.schoolNumber + " " + user.userName);
        }

        System.out.println("Choose a student?");
        String input = scanner.nextLine();
        for (int i = 1; i <= list.size(); i++){
            if (input.equals(String.valueOf(i))){
                studentList.get(list.get(i-1).userName).grades(this.branch);
            }
        }

        //grades(this.branch);

    }*/

    void grades(String lecture){
        System.out.println();
        switch (lecture.toLowerCase()){
            case "mathematics":
                System.out.println("Please enter the note: ");
                super.mathematics = scanner.nextLine();
                System.out.println(this.userName + "Mathematics: " + mathematics);
                break;
            case "physic":
                System.out.println("Please enter the note: ");
                super.physic = scanner.nextLine();
                System.out.println(this.userName + "Physic: " + physic);
                break;
            case "biology":
                System.out.println("Please enter the note: ");
                super.biology = scanner.nextLine();
                System.out.println(this.userName + "Biology: " + biology);
                break;
            case "chemistry":
                System.out.println("Please enter the note: ");
                super.chemistry = scanner.nextLine();
                System.out.println(this.userName + "Chemistry: " + chemistry);
                break;
            case "english":
                System.out.println("Please enter the note: ");
                super.english = scanner.nextLine();
                System.out.println(this.userName + "English: " + english);
                break;
            default:
                System.out.println("Teacher branch is not on the list!");
        }
    }


//          -->  LIBRARY   <--
    void addBook() throws IOException {
        System.out.println("Which book do you want to add?");
        String newBook = scanner.nextLine();

        System.out.println("Do you want to add this book?\n1. Yes 2. No");
        if (scanner.nextLine().equals("1")) {
            bookList.add(newBook);
        }
        saveFile();
    }

    void deleteBook() {
        System.out.println("Which book do yo want to remove?\nNumber: ");
        String strRemove = scanner.nextLine();
        int remove = Integer.parseInt(strRemove);

        if (remove > 0 && remove - 1 < bookList.size()) {
            System.out.println("Do you want to delete the file?\n1. Yes   2. No");
            if (scanner.nextLine().equals("1")) {
                bookList.remove(remove - 1);
            }
        }
        try {
            saveFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void saveFile() throws IOException {
        FileWriter saveBookList = new FileWriter(path);
        for (int i = 0; i < bookList.size(); i++) {
            saveBookList.append(String.valueOf(i + 1)).append(". ").append(bookList.get(i)).append("\n");
        }
        saveBookList.close();
    }
}
