package Overriding;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
        public static void main(String [] args){
            String input = ""+
                    "1 1 1 0 0 0\n"+
                    "0 1 0 0 0 0\n"+
                    "1 1 1 0 0 0\n"+
                    "0 0 2 4 4 0\n"+
                    "0 0 0 2 0 0\n"+
                    "0 0 1 2 4 0";
            Scanner scanner = new Scanner(input);
            int[][] inputArr = new int[6][6];
            while(scanner.hasNextLine()){
                String[] nextLine = scanner.nextLine().split(" ");

                for(int i = 0; i < inputArr.length; i++){
                    for (int j = 0; j < inputArr[i].length; j++){
                        inputArr[i][j] = Integer.parseInt(nextLine[j]);
                    }
                }
            }
            System.out.println(Arrays.deepToString(inputArr));

        }


        public static void HourGlassSum(int[][] arr){






        }
    }