package Training1;

public class Anagram3 {
    public static void main(String[] args) {
        String text1 = "anagram", text2 = "margana";
        Convert convert = new Convert();
        convert.isAnagram(text1,text2);

    }
}

class Convert implements Anag {
    public void isAnagram(String word1, String word2) {
        boolean result = word1.length() == word2.length(); // check the length

        for (int i = 0; i < word1.length(); i++){
            char removeChar = word1.charAt(i);
            int count1 = 0, count2 = 0;
            if (word1.contains(String.valueOf(removeChar))){
                for (int j = 0; j < word1.length(); j++){
                    if (word1.charAt(j) == removeChar){
                        word1 = word1.replace((char) j, '0');
                        count1++;
                    }
                }
                for (int j = 0; j < word2.length(); j++){
                    if (word2.charAt(j) == removeChar){
                        word2 = word2.replace((char) j, '0');
                        count2++;
                    }
                }
                if (count1 != count2 || !word1.equals(word2)) {
                    result = false;
                    break;
                }
            }
        }
        System.out.println(result);
    }

}

interface Anag{
    void isAnagram(String word1, String word2);
}
// String.remove() can solve this problem.

//compare length of both words          +++
//check if there is any other char
//sort both words and compare it