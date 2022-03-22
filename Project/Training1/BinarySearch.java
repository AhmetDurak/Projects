package Training1;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {5, 6, 2, 19, 28, 59, 1, 32, 53, 21, 7, 3};
        Arrays.sort(arr);
        int result = Arrays.binarySearch(arr,32);
        System.out.println(result);

    }

    public static void binarySearch(int[] arr, int key) {
        Arrays.sort(arr);
        System.out.println(arr);
        int first = 0;
        int last = arr.length - 1;
        int mid = (first + last) / 2;

        while (first <= last) {
            if (arr[mid] < key) first = mid + 1;
            else if (arr[mid] == key) {
                System.out.println("Element is found at index:" + mid);
                break;
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }
        if (first > last) System.out.println("Element is not found!");
    }

    public static int recursionSearch(int[] arr, int key, int first, int last) {
        Arrays.sort(arr);

        int mid = (first + last) / 2;

        if (arr[mid] == key) {
            return mid;
        } else {
            if (arr[mid] < key) {
                return recursionSearch(arr, key, mid, last);
            } else return recursionSearch(arr, key, first, mid);
        }


    }



}
