package Training1;

// 09.02.2022

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        System.out.println(frequency("AAABBCDD"));
    }

    public static String frequency(String character) {
        String unique = "";
        String result = "";


        for (int i = 0; i < character.length(); i++) {
            if (!unique.contains(character.charAt(i) + "")) {
                unique = unique +  character.charAt(i);
            }
        }
        for (int i = 0; i < unique.length(); i++) {
            int counter = 0;
            for (int j = 0; j < character.length(); j++) {
                if (unique.charAt(i) == character.charAt(j)) {
                    counter += 1;
                }
            }
            result = result +  unique.charAt(i) + counter;
        }
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
