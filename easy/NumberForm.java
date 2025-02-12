package easy;
public class NumberForm {
    public static String formatPhoneNumber(int[] numbers) {
        if (numbers.length != 10) {
            throw new IllegalArgumentException("Array must have exactly 10 digits.");
        }

        return "(" + numbers[0] + numbers[1] + numbers[2] + ") " +
               numbers[3] + numbers[4] + numbers[5] + "-" +
               numbers[6] + numbers[7] + numbers[8] + numbers[9];
    }

    public static void main(String[] args) {
        int[] phone1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int[] phone2 = {5, 1, 9, 5, 5, 5, 4, 4, 6, 8};
        int[] phone3 = {3, 4, 5, 5, 0, 1, 2, 5, 2, 7};

        System.out.println(formatPhoneNumber(phone1)); // (123) 456-7890
        System.out.println(formatPhoneNumber(phone2)); // (519) 555-4468
        System.out.println(formatPhoneNumber(phone3)); // (345) 501-2527
    }
}