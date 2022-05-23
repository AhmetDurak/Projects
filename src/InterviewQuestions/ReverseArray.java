package InterviewQuestions;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 2, 5};
        System.out.println(Arrays.toString(reverseArray('R', arr)));
    }

    static int[] reverseArray(char dir, int[] arr) {

        int elementLast, elementFirst;
        for (int i = 0; i < arr.length / 2; i++) {
            elementLast = arr[arr.length - i - 1];
            elementFirst = arr[i];

            arr[i] = elementLast;
            arr[arr.length - i - 1] = elementFirst;
        }
        return arr;
    }
}
