import java.util.Arrays;

public class AddElementToArray {

    public static void main(String[] args) {

        int[] array = {1,2,4,5,6,7,8,9};

        System.out.println(Arrays.toString(addElement(array,5, 12)));

        int[] array2 = {12,14,15,16,17,18,19};
        System.out.println(Arrays.toString(mergeArrays(array, array2)));

    }

    public static int[] addElement(int[] array,int index, int element){

        if (index < 0 || index > array.length - 1){
            System.err.println("Index is out of length!");
            System.exit(0);
        }
        int[] result = new int[array.length + 1];

        for (int i = 0; i < result.length; i++){
            if (i > index) {
                result[i] = array[i-1];
                continue;
            }
            result[i] = array[i];
        }
        result[index] = element;
        return result;
    }

    public static int[] mergeArrays(int[] array1, int[] array2){
        int[] mergeArr = new int[array1.length + array2.length];

        for (int i = 0; i < mergeArr.length; i++){
            if (i < array1.length){
                mergeArr[i] = array1[i];
            }else{
                mergeArr[i] = array2[i - array1.length];
            }
        }
        return mergeArr;
    }
}
