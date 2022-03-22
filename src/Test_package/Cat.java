package Test_package;

public class Cat implements Printable {

    @Override
    public void Print() {

        System.out.println("Meow");
    }

    public void ask() {
        System.out.println("Ask??");
    }
}