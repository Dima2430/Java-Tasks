package Task12;
import java.util.Scanner;

public class calculator {
    public static double add(double num1, double num2) {
       
        return num1 + num2; 
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        return num1 / num2;
    }
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         String input = scanner.nextLine();
       String[] arr = input.split(" ");
      
       for (int i = 0; i < arr.length; i++) {
           if (arr[i].equals("+")) {
             System.out.println( add(Double.parseDouble(arr[i-1]), Double.parseDouble(arr[i+1]))); 
           }else if (arr[i].equals("-")) {
             System.out.println( subtract(Double.parseDouble(arr[i-1]), Double.parseDouble(arr[i+1]))); 
           }else if (arr[i].equals("*")) {
             System.out.println( multiply(Double.parseDouble(arr[i-1]), Double.parseDouble(arr[i+1]))); 
           }else if (arr[i].equals("/")) {
             System.out.println( divide(Double.parseDouble(arr[i-1]), Double.parseDouble(arr[i+1]))); 
           }
       }
         scanner.close();
    }
}
