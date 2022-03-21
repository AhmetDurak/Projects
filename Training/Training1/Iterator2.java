package Training1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Iterator2 {

    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(8);
        numbers.add(23);
        numbers.add(2);

        for (int i: numbers){
            System.out.println(i);
        }

        numbers.forEach(System.out::println);




        HashMap<Integer, String> numberList = new HashMap<>();
        numberList.put(0,"null");
        numberList.put(1, "eins");
        numberList.put(2, "zwei");
        numberList.put(3, "drei");

        for (int i: numberList.keySet()){
            System.out.println(i + " value: " + numberList.get(i));
        }

        numberList.forEach((integer, value) -> System.out.println(integer + " " + value));




        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()){
            if (it.next() < 10){
                it.remove();
            }
        }
        System.out.println(numbers);
    }
}
