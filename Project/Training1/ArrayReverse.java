package Training1;

import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        //                0         1
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6}};

        System.out.println(Arrays.deepToString(reverse(arr)));
    }

    static int[][] reverse(int[][] parameter) {
        int row =0;
        int column;
        int[][] reverseArr = new int[parameter.length][3];
        for (int i = parameter.length - 1; i >= 0; i--) {
            column = 0;
            for (int j = parameter[i].length - 1; j >= 0; j--) {
                reverseArr[row][column] = parameter[i][j];
                column++;
            }
            row++;
        }
        return  reverseArr;
    }
}