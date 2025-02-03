package easy;
import java.util.Scanner;
public class howManySeconds {
   

    public static int convertHoursToSeconds(int hours) {
        return hours * 60 * 60;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the hours:");
        int inputHours = scanner.nextInt();
        System.out.println("Your hours converted to seconds: "+ howManySeconds.convertHoursToSeconds(inputHours));
         scanner.close();
}
   
}
