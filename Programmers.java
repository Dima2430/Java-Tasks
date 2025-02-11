

public class Programmers {
    public static int getDifference(int num1, int num2, int num3) {
        int[] arr = {num1, num2, num3};
        int biggest = arr[0];
        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {  
            if (arr[i] > biggest) {
                biggest = arr[i];
            }
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        return biggest - smallest;
    }

    public static void main(String[] args) {
        int difference = getDifference(3000, 4500, 2500);
        System.out.println("Salary difference: " + difference); // Output: 2000
    }
}
