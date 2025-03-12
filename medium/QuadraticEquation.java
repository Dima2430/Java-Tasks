package medium;

public class QuadraticEquation {
    public static int quadraticEquation(int a, int b, int c) {
        int D = b * b - 4 * a * c;
        int x = (-b + (int) Math.sqrt(D)) / (2 * a);
        return x;
    }
    public static void main(String[] args) {
        System.out.println(quadraticEquation(1, 2, -3));    // ➞ 1
        System.out.println(quadraticEquation(2, -7, 3));    // ➞ 3
        System.out.println(quadraticEquation(1, -12, -28)); // ➞ 14
    }
}
