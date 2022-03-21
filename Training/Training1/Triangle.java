package Training1;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        System.out.println("Please enter the layer of triangle: ");
        triangle(new Scanner(System.in).nextInt());
    }
    static void triangle(int line){
        for (int i = 1; i <= line; i++){
            for (int k = line; k >= i; k--){
                System.out.print(" ");
            }

            for (int j = i; j >= 1; j--){
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
