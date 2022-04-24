public class ReformatPhoneNumber {
    public static void main(String[] args) {
        ReformatPhoneNumber number = new ReformatPhoneNumber();
        System.out.println(number.reformat("00-44 48 5555 836   1"));
    }


    public String reformat(String phoneNumber){
        String newNumber = "";

        for (int i = 0, j = 0; i < phoneNumber.length(); i++, j++){
            if (j == 3){
                newNumber = newNumber.concat("-");
                j = 0;
            }
            if (Character.isDigit(phoneNumber.charAt(i))){
                newNumber = newNumber.concat(String.valueOf(phoneNumber.charAt(i)));
            }else j--;
        }

        return newNumber;
    }
}
