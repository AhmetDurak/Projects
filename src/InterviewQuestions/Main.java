package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        binarySearchRecursion(arr, 11);
    }

    public static void binarySearch(int arr[], int key){
        int first = 0;
        int last = arr.length - 1;
        int mid = (first + last)/2;

        while(last >= first){
            if (arr[mid] < key){
                first = mid + 1;
            }
            else if (arr[mid] == key){
                System.out.println("Element is found at index " + mid);
            }else{
                last = mid - 1;
            }
        }
        if (first > last){
            System.out.println("Element is not founded!");
        }
    }

    public static int binarySearchRecursion(int arr[], int key){
        int first = 0;
        int last = arr.length - 1;
        int mid = (first + last) / 2;

        if (arr[mid] < key){
            int[] arrNew = Arrays.copyOfRange(arr, mid +1, last);
            return binarySearchRecursion(arrNew, key);
        }if (arr[mid] > key){
            int[] arrNew = Arrays.copyOfRange(arr,first, mid-1);
            return binarySearchRecursion(arrNew, key);
        }
        if (arr[mid] == key){
            System.out.println("Element is founded at index " + mid);
            return mid;
        }
        return -1;
    }
}































