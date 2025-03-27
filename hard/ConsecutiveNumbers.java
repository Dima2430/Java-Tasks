import java.util.Arrays;

public class ConsecutiveNumbers {
    public static boolean cons(int[] nums) {
        Arrays.sort(nums); 

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] != 1) { 
                return false;
            }
        }
        
        return true; 
    }

    public static void main(String[] args) {
        System.out.println(cons(new int[]{5, 1, 4, 3, 2})); 
        System.out.println(cons(new int[]{1, 3, 2, 5, 4, 7})); 
    }
}
