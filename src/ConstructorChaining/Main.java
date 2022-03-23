package ConstructorChaining;

public class Main {
    {
        System.out.println("initial");
    }

    Main(){
        System.out.println("First main");
    }

    {
        System.out.println("Second initial");
    }

    Main(String value){

    }


    public static void main(String[] args) {

    }
}
