package easy;
public class equal {
    public static int equals(int num1, int num2, int num3) {
        if (num1 == num2 && num2 == num3) {
            return 3; 
        } else if (num1 == num2 || num2 == num3 || num1 == num3) {
            return 2; 
        } else {
            return 0; 
        }
    }
    public static void main(String[] args) {
        System.out.println(equals(1, 2, 3));
         System.out.println(equals(2, 2, 2));
    }
}
