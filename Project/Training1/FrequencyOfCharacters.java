package Training1;

// 09.02.2022

import java.util.Collections;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        System.out.println(frequency2("AWWWBBCDWW"));
    }                                  // A3B3C1D2A1

    public static String frequency(String character) {
        String unique = "";
        String result = "";


        for (int i = 0; i < character.length(); i++) {
            if (!unique.contains(character.charAt(i) + "")) {
                unique = unique + character.charAt(i);
            }
        }
        for (int i = 0; i < unique.length(); i++) {
            int counter = 0;
            for (int j = 0; j < character.length(); j++) {
                if (unique.charAt(i) == character.charAt(j)) {
                    counter += 1;
                }
            }
            result = result + unique.charAt(i) + counter;
        }
        return result;
    }

    public static String frequency2(String str) {
        String[] charList = str.split("");
        String result = "";
        int count = 0;
        String pickedLetter = charList[0];

        for(String each: charList){

        }
        for (int i = 0; i < str.length(); i++) {
            if (pickedLetter.equals(charList[i])) {
                count++;
            } else {
                result = result.concat(pickedLetter).concat(count + "");
                pickedLetter = charList[i];
                count = 0;
                i--;
            }
        }
        result = result.concat(pickedLetter).concat(count + "");
        return result;
    }

    /*public static String frequency2 (String word){
        ArrayList<String> character = new ArrayList<>(Arrays.asList(word.split("")));
        String result = "";


        for (int i = 0; i < character.size(); i++){
            int counter = 0;
            for (int j = 0; j < character.size(); j++){
                if (character.get(i) ){
                    counter++;
                }
            }



            if (counter > 0){
                if (wordArray.contains(word.charAt(i) + String.valueOf(counter))){
                    continue;
                }
                else{
                    wordArray.add(word.charAt(i) + String.valueOf(counter));
                }
            }
        }
        return wordArray.toString();
    }*/
}
