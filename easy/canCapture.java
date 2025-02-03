package easy;

public class canCapture {
    public static boolean capture(String[] moves) {
        String firstRook = moves[0];
        String secondRook = moves[1];
        return firstRook.charAt(0) == secondRook.charAt(0) || firstRook.charAt(1) == secondRook.charAt(1);
    }
    public static void main(String[] args) {
        String[] moves = {"a8", "h8"};
        System.out.println(capture(moves));
    }
}
