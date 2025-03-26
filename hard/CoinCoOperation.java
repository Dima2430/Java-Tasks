public class CoinCoOperation {
    public static String getCoin(String[] firstP, String[] secondP) {
        int first = 3, second = 3;
        for (String string : firstP) {
            if (string.equals("share")) {
                first--;
                second += 3;
            }
        }
        for (String string : secondP) {
            if (string.equals("share")) {
                second--;
                first += 3;
            }
        }
        return "" + first + " " + second;
    }
    public static void main(String[] args) {
        System.out.println(getCoin(new String[] { "steal", "steal", "steal" }, new String[] { "steal", "share", "share" }));
    }
}