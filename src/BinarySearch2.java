import java.util.*;

public class BinarySearch2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,59,32,16,39,92,57,69,8,9,10,11,12,13,14,15,80,84));

        //System.out.println(binarySearch(list, 57));

        //System.out.println("sum :" + soutMe(10));

        Collections.sort(list);
        System.out.println(list);
        System.out.println(binarySearchRecursive(list, 57, 0, list.size() - 1));
    }

    public static int binarySearch(ArrayList<Integer> list, int key){
        Collections.sort(list);
        int start = list.get(0);
        int end = list.get(list.size()-1);
        int mid = (start + end)/2;

        while(mid != key){
            if(key > mid){
                start = mid;
                mid = (start + end)/2;
            }else {
                end = mid;
                mid = (start + end)/2;
            }
        }
        return mid;
    }

    public static int soutMe(int countDown){
        int sum =0;
        sum += countDown;
        if(countDown != 0){
            sum +=  soutMe(countDown - 1);
        }

        return sum;
    }

    public static int binarySearchRecursive(ArrayList<Integer> list, int key, int start, int end){
        int mid = (start + end) / 2;
        //System.out.println("start = " + start);
        //System.out.println("end = " + end);
        //System.out.println("mid = " + mid);
        if(key == list.get(mid)) return mid;
        else if(key < list.get(mid)){
            return binarySearchRecursive(list,key,start,mid - 1);
        }else{
            return  binarySearchRecursive(list,key,mid + 1,end);
        }
    }
}
