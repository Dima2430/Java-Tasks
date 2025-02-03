package easy;
import java.util.Scanner;

public class nameShuffle {
    public static String shuffleNames(String names) {
        String[] arr = names.split(" ");
        return arr[1] + " " + arr[0];
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(shuffleNames(input));
scanner.close();
    }
}
