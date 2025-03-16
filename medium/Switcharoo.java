package medium;

public class Switcharoo {
    public static String switchLetters(String s) {
        String trimmedS = s.trim();
        if (trimmedS.isEmpty() || trimmedS.length() == 1) {
            return "Incompatible.";
        }
        char firstC = trimmedS.charAt(0);
        char lastC = trimmedS.charAt(trimmedS.length() - 1);
        
        if (firstC == lastC) {
            return "Two's a pair.";
        }
        return "" + lastC + trimmedS.substring(1, trimmedS.length() - 1) + firstC;
    }
    public static void main(String[] args) {
        System.out.println(switchLetters("Cat, dog, and mouse."));
        System.out.println(switchLetters(""));
        System.out.println(switchLetters("        "));
        System.out.println(switchLetters("z"));
        System.out.println(switchLetters("          Cat, dog, and mouse.         "));
        System.out.println(switchLetters("zu"));
        System.out.println(switchLetters("!hello!"));
    }
}
