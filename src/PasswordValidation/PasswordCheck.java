package PasswordValidation;

import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {    //Interview
        System.out.println(isPasswordStrong(new Scanner(System.in).nextLine()));

    }


    static boolean isPasswordStrong(String password){

        boolean hasEmptySpace = password.length() >= 8 && !password.contains(" ");
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean specialChar = false;
        boolean hasDigits = false;

        for (char letter: password.toCharArray()){
            if (Character.isUpperCase(letter)){
                hasUpperCase = true;
            }else if (Character.isLowerCase(letter)){
                hasLowerCase = true;
            }else if (Character.isDigit(letter)){
                hasDigits = true;
            }else {     // !Character.isLetterOrDigit = Special
                specialChar = true;
            }
        }
        return hasEmptySpace && hasDigits && hasLowerCase && hasUpperCase && specialChar;
    }

}
