public class PalindromeWord {
    public static boolean isPalindrome(String word) {
        String cleanWord = word.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        if (cleanWord.isEmpty() || cleanWord.length() <= 1) {
            return true;
        }
        if (cleanWord.charAt(0) != cleanWord.charAt(cleanWord.length() - 1)) {
            return false;
        }
        return isPalindrome(cleanWord.substring(1, cleanWord.length() - 1));
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar"));
        System.out.println(isPalindrome("hello"));
        System.out.println(isPalindrome("madam"));
        System.out.println(isPalindrome("A man, a plan, a canal, Panama"));
    }
}
