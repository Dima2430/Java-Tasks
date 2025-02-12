package easy;

public class countVowels {
    public static int count(String str) {
        int count = 0;
        for (char a : str.toLowerCase().toCharArray()) {
            if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(count("hello"));
        System.out.println(count("All test cases are one word and only contain letters"));
    }
}
