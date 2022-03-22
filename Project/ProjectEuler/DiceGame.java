package ProjectEuler;

import java.util.Random;

public class DiceGame {
    public static void main(String[] args) {
        diceGame(10000000);
    }

    public static void diceGame(long count) {
        Random random = new Random();
        float pyramidBeat = 0;
        int pyramid, cubic, sumPyramid = 0, sumCubic = 0;

        for (int i = 0; i < count; i++) {

            for (int j = 0; j < 9; j++) {
                pyramid = random.nextInt(4) + 1;
                sumPyramid += pyramid;
            }
            for (int j = 0; j < 6; j++) {
                cubic = random.nextInt(6) + 1;

                sumCubic += cubic;
            }


            if (sumCubic < sumPyramid) pyramidBeat++;
            sumCubic = 0;
            sumPyramid = 0;
        }

        System.out.println("%" + pyramidBeat);
    }
}
