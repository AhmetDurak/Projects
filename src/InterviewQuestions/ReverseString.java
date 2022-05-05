package InterviewQuestions;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a String: ");
        reverse(scanner.nextLine());

    }

    public static String reverse(String input) {
        if (input == null)
            throw new IllegalArgumentException("Null is not a valid input!");
        String reverseWord = "";
        for (int i = input.length()-1; i >= 0 ; i--){
            reverseWord = reverseWord.concat(String.valueOf(input.charAt(i)));
        }
        return reverseWord;
    }
}
