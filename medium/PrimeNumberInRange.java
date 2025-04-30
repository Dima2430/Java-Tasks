package medium;

public class PrimeNumberInRange {

    public static boolean hasPrimeInRange(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) return true;
        }
        return false;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int count = 0;
        while (count < 10) {
            int rand = (int)(Math.random() * 99_000_001) + 1_000_000;
            if (isPrime(rand)) {
                System.out.println(rand + " is prime.");
                count++;
            }
        }
    }
}
