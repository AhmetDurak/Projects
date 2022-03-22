import java.util.ArrayList;
import java.util.Arrays;

public class doubleCheck {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,4,3,4,4,5,6,7,8));

        ArrayList<Integer> newList = new ArrayList<>();

        for (Integer each : list) {
            if (list.indexOf(each) != list.lastIndexOf(each)){
                if (newList.contains(each))continue;
                newList.add(each);
            }
        }

        System.out.println(newList);


    }
}

class doubleCheck2{
    doubleCheck2(){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));


    }
}