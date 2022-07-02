import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class BinarySearch2 {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(7,3,4,5,2);
        int[] myArr = {2,3,4,5};

        HashSet<Integer> mySet = new HashSet<>();

        mySet.add(4);
        mySet.add(4);
        mySet.add(5);
        mySet.addAll(number);
        Arrays.sort(myArr);
        System.out.println(mySet);

        // check it out how it works ????
        //Object[] h = mySet.toArray();
        //System.out.println(h[0]);

        Iterator<Integer> it = mySet.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
