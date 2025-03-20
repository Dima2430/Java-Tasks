package hard;

public class SevenBoom {
    public static String sevenBoom(int[] nums) {
        String str = "";
        for (int i : nums) {
            if (i == 7) {
                str = "Boom!";
                break;
            } else {
                str = "there is no 7 in the array";
            }
        }
        return str;
    }
    public static void main(String[] args) {
        System.out.println(sevenBoom(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));
    }
}
