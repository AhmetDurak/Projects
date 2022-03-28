package Others2;


public class Solution {
    int value;
    Solution(){
        this("");
    }

    Solution(String value){
        this(4);
    }

    Solution(int value){
        this.value = value;
    }

    public static void main(String[] args){
        Solution solution = new Solution();
        System.out.println(solution.value);
    }
}