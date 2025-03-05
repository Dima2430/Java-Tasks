package medium;

public class BasicCalculator {
    public static int calculate(int a, char op, int b) {
        if (op == '+') {
            return a + b;
        } else if (op == '-') {
            return a - b;
        } else if (op == '*') {
            return a * b;
        } else if (op == '/') {
            if (b == 0) {
                 throw new ArithmeticException("Cannot divide by zero");
            }
            return a / b;
        } else {
            throw new IllegalArgumentException("Invalid operator: " + op);
        }
    }
    public static void main(String[] args) {
         System.out.println(calculate(1, '+', 2)); // 3
        System.out.println(calculate(10, '-', 3)); // 7
        System.out.println(calculate(4, '*', 5)); // 20
        System.out.println(calculate(8, '/', 2)); // 4

        System.out.println(calculate(10, '/', 0)); // Throws ArithmeticException
        System.out.println(calculate(5, '%', 2)); // Throws IllegalArgumentException
    }
}
