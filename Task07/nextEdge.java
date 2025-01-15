package Task07;
public class nextEdge {
    public static int calc(int side1, int side2) {
        return (side1 + side2) - 1;
    }

    public static void main(String[] args) {
        System.out.println(nextEdge.calc(8, 8));
    }
}
