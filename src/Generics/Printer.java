package Generics;

public class Printer<T, V> {

    T thingToPrint;
    V otherThingsToShout;

    public Printer(T thingsToPrint){

        this.thingToPrint = thingsToPrint;


    }

    public void print(){
        System.out.println(thingToPrint);
    }

}
