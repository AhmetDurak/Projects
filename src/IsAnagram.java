public class IsAnagram {
    public static void main(String[] args) {
        System.out.println(new IsAnagram().isAnagram("stas", "rats"));
    }

    boolean isAnagram(String word1, String word2) {
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();
        int counter = 0;

        for (int i = 0; i < word1.length(); i++){
            for (int j = 0; j < word1.length(); j++){
                if (word1.charAt(i)==word2.charAt(j)){
                    counter++;
                    word2 = word2.replaceFirst(word2.charAt(j) + "", " ");
                }
            }
        }if (counter == word1.length()) return true;
        else return false;
    }
}
// eareh --> heart
