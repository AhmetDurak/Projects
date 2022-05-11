package SchoolMS;

import java.io.IOException;

public class Main {

    static StudentLog log;
    static TeacherLog teacherLog;
    static Library library;
    static Admin admin;
    static Teacher teacher;

    public static void main(String[] args) throws IOException, InterruptedException {

        log = new StudentLog();
        teacherLog = new TeacherLog();
        library = new Library();


        //Log.teacherList.get("Nurdan Töre").infoTeacher("Nurdan Töre");
        //log.saveStudent();

        Log.studentList.get("Kemal Torun").infoStudent("Kemal Torun","1234");

        //library.showBookList();
        //library.getDeleteBook();
        //library.getAddBook();
        //new Admin().student();
        //log.eraseStudent();
        //userLogin.start();
    }
}