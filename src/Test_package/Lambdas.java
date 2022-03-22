package Test_package;


public class Lambdas {
    public static void main(String[] args) {
        Cat cat = new Cat();

        //cat.Print();

        printThings(() -> System.out.println("Meow"));

    }

    static void printThings(Printable thing) {
        thing.Print();
    }

}