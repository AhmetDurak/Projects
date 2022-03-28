package Others2;


import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) {
        Student student1 = new Student();

    }


}
class Student{
    String clothes,  notes, lessons;

    Student(){
        this("5");
        this.clothes = "Jacket, shoes, tie";
        this.lessons = "Math, Chemical, Biology, English";

    }
    Student(String grade){
        this(Integer.parseInt(grade));
    }

    Student(int degree){
        System.out.println(degree);
    }

    void addNote(){}
    void isPassedExam(){}

}


// public, default, protected, private