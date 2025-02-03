package easy;
public class checkEnding {
    public static boolean checkingEnding(String str, String ending) {
        return str.endsWith(ending);
    }
    public static void main(String[] args) {
        System.out.println(checkingEnding("Hello", "lo"));
    }
}
