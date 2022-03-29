package Test_package;

public class EnumExample {
    School who;

    EnumExample(School who){
        this.who = who;
    }

    void name(){
        switch (who){
            case ADMIN:
                System.out.println("Admin");
                break;
            case TEACHER:
                System.out.println("Teacher");
                break;
            case PARENT:
                System.out.println("Parent");
                break;
            case STUDENT:
                System.out.println("Student");
                break;
        }
    }

    public static void main(String[] args) {
        //EnumExample admin = new EnumExample(School.ADMIN);
        //admin.name();
        //EnumExample teacher = new EnumExample(School.TEACHER);
        //teacher.name();
        //EnumExample parent = new EnumExample(School.PARENT);
        //parent.name();
        //EnumExample student = new EnumExample(School.STUDENT);
        //student.name();

        //for (Company cName: Company.values()){
        //    System.out.println("Company Value: " + cName.value + " - Company Name: " + cName);
        //}

        System.out.println(Company.EBAY.value);
    }



    enum School {
        STUDENT,
        TEACHER,
        ADMIN,
        PARENT;

    }

    enum Company {
        EBAY(30), PAYPAL(10), GOOGLE(15), YAHOO(20), ATT(25);
        private int value;

        private Company(int value) {
            this.value = value;
        }
    }
}


