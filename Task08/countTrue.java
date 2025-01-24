package Task08;

public class countTrue {
    static int countTrueF(boolean[] arr) {
        int count = 0;
        for (boolean b : arr) {
            if (b) {
                count++;
            }
        }
        return count;

    }
    public static void main(String[] args) {
        boolean[] arr = {true, false, true, true, false};
        System.out.println(countTrue.countTrueF(arr));
    }
} 
