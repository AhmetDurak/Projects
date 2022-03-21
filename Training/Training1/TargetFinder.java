package Training1;

import java.util.Arrays;

public class TargetFinder {
    public static void main(String[] args) {

        int[] arr1 = {2, 4, 5, 6, 7, 12, 24, 15, 34, 22, 17, 28};
        int[] arr2 = {23, 12, 24, 27, 13, 18, 3, 5, 7, 1, 9, 11};

        targetFinder(arr1, arr2);
    }

    public static void targetFinder(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int rest = 0;
        for (int i = arr1.length - 1; i >= 0; i--) {
            int sum;
            for (int j = rest; j < arr2.length; j++) {
                sum = arr1[i] + arr2[j];
                if (sum > 35) {
                    break;
                }
                else if (sum < 30){
                    rest++;
                }
                else System.out.print(arr1[i] + "," + arr2[j] + "  ");
            }
        }
    }
}