package medium;

public class ReverseString {
    public static String reverseString(String s) {
        char[] c = new char[s.length()];
       for (int i = 0; i < s.length(); i++) {
            c[i] = s.charAt(s.length() - 1 - i);
        }
        return new String(c);
    }
public static void main(String[] args) {
    System.out.println(reverseString("hello"));
}
}
