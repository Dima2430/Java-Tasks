package easy;

public class Solutions {
    public static int countRealSolutions(double a, double b, double c) {
        double D = b * b - 4 * a * c;
        if (D > 0) {
            return 2;
        } else if (D == 0) {
            return 1;
        } else {
            return 0;
        }

    }
    public static void main(String[] args) {
        System.out.println(countRealSolutions(1,0,0));
    }
}
