package SchoolMS;

import java.io.IOException;

public class Main {

    static StudentLog log;
    static TeacherLog teacherLog;
    static Library library;
    static Admin admin;
    static Teacher teacher;

    public static void main(String[] args) throws IOException, InterruptedException {

        Thread userLogin = new Thread(new UserLogin());
        userLogin.start();
        log = new StudentLog();
        teacherLog = new TeacherLog();
        library = new Library();


        Log.teacherList.get("Nurdan Töre").infoTeacher("Nurdan Töre");
        log.saveStudent();

        //library.showBookList();
        //library.getDeleteBook();
        //library.getAddBook();
        //new Admin().student();
        //log.eraseStudent();
        //userLogin.start();
    }
}