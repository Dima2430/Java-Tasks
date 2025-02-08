package easy;

public class getWord {
    public static String getTheWord(String str1, String str2) {
        String firstword = str1.substring(0, 1).toUpperCase() + str1.substring(1) + " ";
        return firstword + str2;
    }
    public static void main(String[] args) {
        System.out.println(getTheWord("hello", "world"));
    }
}