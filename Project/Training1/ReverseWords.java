package Training1;

public class ReverseWords {
    public static void main(String[] args) {

        String word = "the sky is blue";

        String reverseWord = "";

        String[] wordList = word.split(" ");

        for (int i = wordList.length -1; i >= 0; i--){
            reverseWord = reverseWord + wordList[i] + " ";
        }

        System.out.println(reverseWord);
    }
}
