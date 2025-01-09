package Task01;

public class SumOfTwoNumbers {
    int num1;
    int num2;

    public SumOfTwoNumbers(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int sum() {
        return num1 + num2;
    }

    public static void main(String[] args) {
       
        SumOfTwoNumbers sum = new SumOfTwoNumbers(12, 34);
        System.out.println(sum.sum());
    }
}