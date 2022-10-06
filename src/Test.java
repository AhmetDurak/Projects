public class Test {
    public static void main(String[] args) {
        Student.studentName = "name";           // you can not instantiate it. You can only have one copy of static

    }
}
class Student{
    public static String studentName;
    public String schoolName;
}