package medium;

public class RectangleinCircle {
    public static boolean checkIfFits(double width, double height, double radius) {
        if (width <= 0 || height <= 0 || radius <= 0) {
            throw new IllegalArgumentException("All dimensions must be positive numbers.");
        }
        double diagonal = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
        return radius *2 >= diagonal;
    }

    public static void main(String[] args) {
        test(8, 6, 5);
        test(5, 9, 5);
        test(8, -6, 5);
        test(8, 6, 0);
        test(4, 7, 4);
    }

    private static void test(double width, double height, double radius) {
        try {
            boolean result = checkIfFits(width, height, radius);
            System.out.println("Fit?" + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: " + e.getMessage());
        }
    }
}
