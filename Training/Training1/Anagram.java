package Training1;

import java.util.Scanner;

public class Anagram {

    static boolean isAnagram2(String a, String b) {


        int aSum = 0;
        int bSum = 0;

        for (int i = 0; i < a.length(); i++){ // numerical value of the word
            aSum += a.charAt(i);
        }
        for (int i = 0; i < b.length(); i++) {
            bSum += b.charAt(i);
        }

        boolean result = false;
        boolean result2 = false;

        if (a.length() !=b.length()){  // if the length of both words different
            return false;
        }

        for (int i= 0; i < a.length(); i++) {  // if the word doesn't contain a character
            if (!b.contains(String.valueOf(a.charAt(i)))){
                break;
            }else result = true;
        }
        for (int i= 0; i < a.length(); i++) {   // double check for sure, bcz other word can contain all characters.
            if (!a.contains(String.valueOf(b.charAt(i)))){
                break;
            }else result2 = true;
        }

        if (aSum == bSum && result && result2) return true;
        else return false;

    }

    static boolean isAnagram(String a, String b){
        // how long our words? Are they equal
        if (a.length() != b.length()) return false;
        else{// does the words include same letters?
            //word1 = silent        s
            //word2 = tnelis ----> word2 = word2.replaceFirst(character, "");
            for (int i = 0; i < a.length(); i++){
                char letter = a.charAt(i);
                b = b.replaceFirst(String.valueOf(letter), "");
            }
        }

        if (!b.isEmpty()) return false;
        else return true;



        // are there any other letter in other word



    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next().toLowerCase();
        String b = scan.next().toLowerCase();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
