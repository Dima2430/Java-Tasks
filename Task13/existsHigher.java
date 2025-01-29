public class existsHigher {
    public static boolean existsHigherNumber(int[] arr, int num) {

        for (int i : arr) {
            if (i > num)
                return true;
        }
        return false;
    }
public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
    System.out.println(existsHigherNumber(arr, 100));
}
}
