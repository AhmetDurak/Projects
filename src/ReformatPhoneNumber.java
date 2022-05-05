public class ReformatPhoneNumber {
    public static void main(String[] args) {
        ReformatPhoneNumber number = new ReformatPhoneNumber();
        System.out.println(number.reformat("0 22 1985--324"));
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
