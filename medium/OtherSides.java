package medium;

import java.util.Arrays;
public class OtherSides {
    public static double[] findSides(double shortestSide) {
        double longestSide = shortestSide * 2;
        double middleSide = Math.sqrt(3) * shortestSide;
        return new double[] { longestSide, middleSide };
    }
    public static void main(String[] args) {
        System.out.println( Arrays.toString(findSides(1))); 
    }
}
