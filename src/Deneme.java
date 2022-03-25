import java.util.Scanner;

public class Deneme {
    public static boolean isAnagram(String word1, String word2)
    {
        int stringLength;
        int counter=0;
        /*when counter reaches the string length, then there are equal number of same characters between these two strings*/

        word1=word1.toLowerCase();
        word2=word2.toLowerCase();

        stringLength=word1.length();

        if (word1.length()!=word2.length())
        {
            return false;
        }

        for(int i=0;i<stringLength;i++)
        {
            for(int j=0;j<stringLength;j++)
            {
                if(Character.compare(word1.charAt(i),word2.charAt(j))==0)
                {
                    counter++;
                }
            }
        }

        if(counter==word1.length())
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isAnagram(in.nextLine(), in.nextLine()));
    }
}