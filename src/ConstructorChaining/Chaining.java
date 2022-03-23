package ConstructorChaining;

public class Chaining {

    Chaining(){
        this(4);
    }

    Chaining(int value){
        System.out.println("Chaining only value: " + value);

    }

    Chaining(int value, String result){


    }

}

class subClass extends Chaining{

    subClass(){
        super(5, "result");
    }

    void callConstructor(){
    }
}

