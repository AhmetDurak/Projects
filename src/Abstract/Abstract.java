package Abstract;

public class Abstract implements DogInterface{


    public static void main(String[] args) {

        Abstract a = new Abstract();

        a.poop();

        a.Cat();


    }

    public void Cat(){
        System.out.println("miyav");
        poop();
    }

    @Override
    public void poop() {
        System.out.println("Uppsi i've pooped.");
    }

    @Override
    public void bark() {
        System.out.println("go somewhere else to bark!");

    }
}


abstract class Dog{
    String breed;

    public void bark(){
        System.out.println("Bark!");
    }

    public abstract void poop();
}

class Chihuahua extends Dog{

    public void poop(){
        System.out.println("Dog pooped!");
    }


}

interface DogInterface{
    void poop();
    void bark();
    int barksWhom = 0;
}