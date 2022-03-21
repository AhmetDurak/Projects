package Training1;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number: ");
        int numberOfStars = scanner.nextInt();

        for (int row = 0; numberOfStars > row; row++) {
            for (int column = 1; numberOfStars - row > column; column++) {
                System.out.print(" ");
            }
            for (int i = 0; i < 2 * row - 1; i++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int row = numberOfStars - 2; row > 0; row--) {
            for (int column = 1; numberOfStars - row > column; column++) {
                System.out.print(" ");
            }
            for (int i = 0; i < 2 * row - 1; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}