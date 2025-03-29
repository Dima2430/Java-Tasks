public class HarshadNumber {
    public static boolean isHarshad(int num) {
        String str = String.valueOf(num);
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            int n = Character.getNumericValue(str.charAt(i));
            sum += n;
        }
        return num % sum == 0;
    }
    public static void main(String[] args) {
        System.out.println(isHarshad(13));
    }
}