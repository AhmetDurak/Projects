package ProjectEuler;

import java.util.Arrays;

public class LatticePaths {
    public static void main(String[] args) {
        latticePaths(20);
    }

    static void latticePaths(int a) {
        // basically it's a repeated permutation

        int[] number1 = new int[a];
        int[] number2, number3;
        int value = a;
        for (int i = 0; i < a; i++) {
            number1[i] = value--;
        }
        number2 = Arrays.copyOfRange(number1,10,20);
        number3 = Arrays.copyOf(number2, number2.length);

        for (int i = 0; i < number2.length; i++) {
            for (int j = 0; j < a; j++) {
                if (number1[j] % number2[i] == 0){
                    number1[j] /= number2[i];
                }
            }
        }

    }
}
