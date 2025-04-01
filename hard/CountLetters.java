public class CountLetters {
    public static void count(String str) {
        String newStr = str.trim().toLowerCase();
        if (newStr.isEmpty()) {
            return;
        }
        char firstC = newStr.charAt(0);
        int count = 0;
        for (int i = 0; i < newStr.length(); i++) {
            if (firstC == newStr.toCharArray()[i]) {
                ++count;
            }
        }
        System.out.println("" + firstC + ":" + count);
        String nextStr = newStr.replaceAll(String.valueOf(firstC), "");

        count(nextStr);
    }
    public static void main(String[] args) {
        count("nuLl");
        count("       ");
    }
}
