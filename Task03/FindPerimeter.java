package Task03;

public class FindPerimeter {
    int firstSide;
    int secondSide;

    public FindPerimeter(int num1, int num2) {
        firstSide = num1;
        secondSide = num2;
    }

    public int calc() {
        return 2 * (firstSide + secondSide);
    }

    public static void main(String[] args) {
        FindPerimeter per = new FindPerimeter(12, 33);
        System.out.println(per.calc());
    }
}
