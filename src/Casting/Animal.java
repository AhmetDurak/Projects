package Casting;

public class Animal {
    String name;

    public void makeNoise(){
        System.out.println("I'm just an Animal");
    }

    public void animalSound(){
        System.out.println("I'm not an animal");
    }

}
class Dog extends Animal{

    @Override
    public void makeNoise(){
        System.out.println("Woof woof!");
    }

    public void growl(){
        System.out.println("Grrrrr");
    }
}
class Cat extends Animal{
    void meow(){
        System.out.println("Meowwwww");
    }
}