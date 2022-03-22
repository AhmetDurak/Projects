package PasswordValidation;

import java.util.Arrays;

public class ArraysMerge {
    public static void main(String[] args) {


        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9};
        int[] arr3 = merge(arr1, arr2);

        System.out.println(Arrays.toString(arr1) + ", " + Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));

        System.out.println("---------------------------------");


        //String[] a1 = {"A", "B", "C"};
        //String[] a2 = {"D", "E", "F"};

        //String[] result = merge(a1, a2);

        //System.out.println(Arrays.toString(result));

    }

    //merge the given two arrays and returns the new array
    public static int[] merge(int[] arr1, int[] arr2) {
        // int[] result = {};
        int[] result = new int[arr1.length + arr2.length]; // ==> !!!!burda da bu yöntem olmadi!!!!!

        //System.out.println(Arrays.toString(result));
        //System.out.println(arr1.length + arr2.length);
        //for (int each : arr1) {
        //    result = addElement(result, each);
        //}
        //for (int each : arr2) {
        //    result = addElement(result, each);
        //}


        for (int i = 0; i < result.length; i++){    // arr1.length : 5  arr2.length : 4

            if (i >= arr1.length){
                result[i] = arr2[i - arr1.length];
            }else {
                result[i] = arr1[i];
            }
        }
        return result;
    }

    //adds the given element to array, returns anew array
    public static int[] addElement(int[] array, int element) {

        int[] result = new int[array.length + 1];

        int i = 0;

        for (int each : array) {

            result[i++] = each;
        }

        result[i] = element;

        return result;
    }
}