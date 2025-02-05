package easy;
public class differenceMaxMin {
    public static int difference(int[] nums) {
        int min = nums[0];
        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            
            if(nums[i] < min) {
                min = nums[i];
            }
        }

        return max - min;
    }
    public static void main(String[] args) {
        System.out.println(difference(new int[] { 10, 4, 1, 4, -10, -50, 32, 21 }));
        System.out.println(difference(new int[]{-5, -20, -3, -8})); 

    }
}
