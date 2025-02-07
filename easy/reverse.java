package easy;

public class reverse {
    public static String reverseStr(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(reverseStr("hello"));
        System.out.println(reverseStr("The quick brown fox."));
    }
}