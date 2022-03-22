package ProjectEuler;

import java.util.Arrays;

public class ZombieAttack {
    public static void main(String[] args) {
        int[] population = {3, 6, 0, 4, 3, 2, 7, 0};
        invasion(population);

    }

    public static void invasion(int[] population) {
        System.out.println("Day 0 " + Arrays.toString(population));
        int[] zero = new int[population.length];
        int k = 1;
        while (!Arrays.equals(zero, population)) {
            for (int i = 0; i < population.length; i++) {
                if (population[i] == 0 && i == population.length - 1) {
                    population[i - 1] /= 2;
                } else if (population[i] == 0 && i == 0) {
                    population[i + 1] /= 2;
                } else {
                    if (population[i] == 0 && population[i - 1] != 0) {
                        population[i - 1] /= 2;
                    }
                    if (population[i] == 0 && population[i + 1] != 0) {
                        population[i + 1] /= 2;
                        if (population[i + 1] == 0) i++;
                    }
                }
            }
            System.out.println("Day " + k++ + " " + Arrays.toString(population));
        }if (Arrays.equals(zero, population)) System.out.println("---- EXTINCT ----");
    }
}
