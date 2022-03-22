package Training1;

import java.util.HashMap;
import java.util.Scanner;

public class Anagram2 {

    public static HashMap<String, Integer> Heso(String a) {
        HashMap<String, Integer> unique = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            int value = 0;
            if (!unique.keySet().contains(String.valueOf(a.charAt(i)))) {
                unique.put(String.valueOf(a.charAt(i)), ++value);
            } else {
                value = unique.get(String.valueOf(a.charAt(i)));
                unique.put(String.valueOf(a.charAt(i)), ++value);
            }
        }
        return unique;
    }

    public static boolean isAnagram2(String a, String b) {
        HashMap<String, Integer> aText = new HashMap<>();
        HashMap<String, Integer> bText = new HashMap<>();

        a = a.toLowerCase();
        b = b.toLowerCase();

        if (a.length() != b.length()) return false;

        aText = Heso(a);
        bText = Heso(b);


        System.out.println(aText + "\n" + bText);

        boolean values = true;

        if (aText.equals(bText) && values) return true;
        else return false;

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram2(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}


