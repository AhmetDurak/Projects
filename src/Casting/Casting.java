package Casting;

public class Casting {  // up-casting needs nothing. Java does it by itself.
    public static void main(String[] args) {
        Dog myAnimal = new Dog();
        Animal myAnimal2 = new Cat();

         
        doAnimalStuff(myAnimal);
        doAnimalStuff(myAnimal2);



    }

    public static void doAnimalStuff(Animal animal) {// to do down casting we need to make it explicitly.
        animal.makeNoise();

        if (animal instanceof Dog){         // check if it is called from Dog class
            Dog myDog = (Dog) animal;
            myDog.growl();
        }

        if (animal instanceof Cat){         // to do down-casting we always use instanceof, otherwise castException pops up!!
            Cat myCat = (Cat) animal;
            myCat.meow();
        }

    }
}
