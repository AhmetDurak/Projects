package Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {
    public static void main(String[] args) {

//        Printer<Integer> printer = new Printer<>(23);
//        printer.print();
//
//        Printer<Double> doublePrinter = new Printer<>(33.5);
//        doublePrinter.print();
        // so we don't need to create a new class which stores double

//        Printer<Cat> catPrinter = new Printer<>(new Cat());
//        catPrinter.print();
//        // we can bound our generic class, so it can be only cat and dog
//        // we can add any other bounding interface, but it should be after extended class <T> extends Animal & Interface
//
//        Printer<Dog> dogPrinter = new Printer<>(new Dog());
//        dogPrinter.print();
//
//
       ArrayList<Object> cats = new ArrayList<>();
       cats.add(new Cat());

        Cat myCat = (Cat) cats.get(0);
        // if we know class type in index we're looking for, then we can cast it
        //but if we cast a wrong class it won't show any error message but won't work either.
        // to avoid this problem, it is safer to use Cat class instead of Object(it means it can be anything)

        cats.add(new Dog());
        //myCat = (Cat) cats.get(1);


        ArrayList<Cat> cat = new ArrayList<>();
      //cat.add(new Dog());                  // it shows an error message and can't compile the code

        shout("John", 57);

        List<Integer> intList = new ArrayList<>();
        intList.add(3);
        printList(intList);

        List<Dog> catList = new ArrayList<>();
        //catList.add(new Cat());
        catList.add(new Dog());
        printList(catList);


   }

   private static <T, V> void shout(T thingToShout, V otherThingToShout) {       // we can call generic method as well.
       System.out.println(thingToShout + " " + otherThingToShout);
   }

   private static <T, V> T shoutGeneric(T thingToShout, V otherThingToShout) {
       return thingToShout;
   }

   private static void printList(List<?> myList) {// wild card is used if we don't know what type of generics are going to be used
       System.out.println(myList);                 // we can bound wild card as well, but when we use the method, then it shouldn't be out of bound
    }

}
