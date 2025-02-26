package medium;
public class LetterCounter {
    public static int letterCounter(char[][] arr, char letter) {
        int count = 0;
        for (char[] a : arr) {
            for (char c : a) {
                if (c == letter) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(letterCounter(new char[][] {{'a', 'h', 'c'}, {'d', 'h', 'f'}, {'g', 'h', 'i'}}, 'h'));
    }
}
