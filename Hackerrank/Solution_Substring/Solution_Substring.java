package Solution_Substring;

public class Solution_Substring {
    public static String getSmallestAndLargest(String s, int k){
        String smallest = s;
        String largest = "";

        String smallest2;
        for (int i = 0; i < s.length(); i++){
            if (i + k > s.length())break;
            else smallest2 = s.substring(i, i + k);
            if (smallest2.compareTo(largest) > 0){
                largest = smallest2;
            }
            if (smallest2.compareTo(smallest) < 0){
                smallest = smallest2;
            }

        }



        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        System.out.println(getSmallestAndLargest("welcometojava", 3));
    }
}
