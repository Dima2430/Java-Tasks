package hard;

import java.util.Arrays;

public class LargestGap {
    public static int largestGap(int[] nums) {
        int maxGap = 0;
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            int gap = nums[i] - nums[i-1];
            if (gap > maxGap) {
                maxGap = gap;
            }

        }
       return maxGap;
    }
    public static void main(String[] args) {
         System.out.println(largestGap(new int[]{9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5}));
    }
}
