package Training1;

//03.02.2022

import java.util.Scanner;

class Roulet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen bir numara giriniz: ");
        int pocketNumber = scanner.nextInt();
        RouletTest user1 = new RouletTest(pocketNumber);
    }
}

class RouletTest {// //Roulette Wheel Colors

    RouletTest(int pocketNumber) {

        if (pocketNumber < 0 || pocketNumber > 36) {
            System.out.println("Error!");

        } else if (pocketNumber == 0) {
            System.out.println("green");

        } else if ((pocketNumber <= 10) || (pocketNumber >= 19 && pocketNumber <= 28)) {
            if (pocketNumber % 2 == 0) {
                System.out.println("black");
            } else {
                System.out.println("red");
            }
        } else {
            if (pocketNumber % 2 == 0) {
                System.out.println("red");
            } else {
                System.out.println("black");
            }
        }
    }
}