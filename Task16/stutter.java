package Task16;
public class stutter {
    public static String stutterWord(String str) {
        String firstTwoLetters = str.substring(0, 2).concat("... ");
        return firstTwoLetters + firstTwoLetters + str;
    }
    public static void main(String[] args) {
        System.out.println(stutterWord("incredible"));
    }
}
