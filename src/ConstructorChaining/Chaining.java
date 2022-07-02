package ConstructorChaining;

public class Chaining {

    Chaining(){
        this(4);
    }

    Chaining(int value){
        System.out.println("Chaining only value: " + value);

    }

    Chaining(int value, String result){
        System.out.println("Parent Constructor");
    }

}

class subClass extends Chaining{

    subClass(){
        this(5);
        System.out.println("Subclass");
    }
    subClass(int value){
        super(value, "result");
        System.out.println("Subclass " + value);
    }

    public static void main(String[] args) {
        subClass subClass = new subClass(5);
    }
}

