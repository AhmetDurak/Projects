package Others;

import java.util.Scanner;

public class IsPasswordStrong {
    public static void main(String[] args) {

        System.out.println(new IsPasswordStrong().checkPassword(new Scanner(System.in).nextLine()));

    }

    boolean checkPassword(String password) {
        boolean hasUpperCase = false, hasLowerCase = false, hasSpecialChar = false;
        boolean hasNumber = false;

        boolean hasEnoughLength = password.length() >= 8 && !password.contains(" ");

        for (char everyLetter: password.toCharArray()){
            if (Character.isUpperCase(everyLetter)) hasUpperCase = true;
            if (Character.isLowerCase(everyLetter)) hasLowerCase = true;
            if (Character.isDigit(everyLetter)) hasNumber = true;
            if (!Character.isLetterOrDigit(everyLetter)) hasSpecialChar = true;
        }
        return hasEnoughLength && hasUpperCase && hasLowerCase&& hasNumber && hasSpecialChar;
    }
}


// password length should be more than 8
// special character
// number and Uppercase
//