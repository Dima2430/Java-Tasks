package easy;
public class changeEnough {
    public static boolean enough(int[] change, double amount) {
        int amountInCents = (int) Math.round(amount * 100);
        
        int totalCents = (change[0] * 25) + 
                         (change[1] * 10) +  
                         (change[2] * 5) +   
                         (change[3] * 1);    
        
        return totalCents >= amountInCents;
    }

    public static void main(String[] args) {
        System.out.println(enough(new int[]{2, 100, 0, 0}, 14.11)); // false
        System.out.println(enough(new int[]{0, 0, 20, 5}, 0.75));   // true
        System.out.println(enough(new int[]{30, 40, 20, 5}, 12.55)); // true
        System.out.println(enough(new int[]{10, 0, 0, 50}, 3.85));  // false
        System.out.println(enough(new int[]{1, 0, 5, 219}, 19.99)); // false
    }
}
