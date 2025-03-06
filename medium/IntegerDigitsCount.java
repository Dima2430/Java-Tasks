package medium;

public class IntegerDigitsCount {
    public static int countDigits(int num) {
        String str = String.valueOf(num);
        return str.length();
    }
    public static void main(String[] args) {
        System.out.println(countDigits(1234));
    }
}