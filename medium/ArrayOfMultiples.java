package medium;
import java.util.Arrays;

public class ArrayOfMultiples {
    public static int[] getArrayOfMultiples(int num, int length) {
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = num * (i + 1);
        }
        return arr;
    }
    public static void main(String[] args) {
         System.out.println( Arrays.toString(getArrayOfMultiples(7, 5))); 
    }
}
