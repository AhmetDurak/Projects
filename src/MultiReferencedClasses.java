import java.util.*;

public class MultiReferencedClasses{}


class MyClass {
    int count;

    public void myMethod(MyClass ref){
        ref.count++;
    }
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        MyClass secondClass = myClass;
        myClass.count = 1;
        myClass.myMethod(myClass);

        //System.out.println(myClass.count);
        //System.out.println(secondClass.count);


        Map<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(4, "d");
        for (Integer key: map.keySet()){

        }

    }


}

