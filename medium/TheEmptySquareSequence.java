package medium;
public class TheEmptySquareSequence {
    public static int theEmptySquareSequence(int n) {
        double square = Math.pow(n * 2, 2);
        return (int) square - n * 4;
    }
    public static void main(String[] args) {
        System.out.println(theEmptySquareSequence(3));
    }
}
