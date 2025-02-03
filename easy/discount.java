package easy;

public class discount {
    public static double priceWithDiscount(int price, int discount) {
        return price - (price * discount / 100);
    }
    public static void main(String[] args) {
        System.out.println(priceWithDiscount(100, 10));
    }
}
