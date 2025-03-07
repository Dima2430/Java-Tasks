package medium;
public class AddingNumbers {
    public static String add(String num1, String num2) {
        if (num1 == null || num2 == null || num1 == "" || num2 == "")
            return "Invalid Operation";
        return String.valueOf(Integer.parseInt(num1) + Integer.parseInt(num2));
    }
    public static void main(String[] args) {
        System.out.println(AddingNumbers.add("1", "2"));
    }
}
