package medium;

import java.util.Arrays;

public class SquarePatch {
    public static int[][] squarePatch(int n) {
        int[][] patch = new int[n][n];
        if (n == 0) {
            return new int[0][0];
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                patch[i][j] = n;
            }
        }
        return patch;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(squarePatch(3)));
        System.out.println(Arrays.deepToString(squarePatch(5)));
        System.out.println(Arrays.deepToString(squarePatch(1)));
        System.out.println(Arrays.deepToString(squarePatch(0)));
    }
}