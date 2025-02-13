package easy;
public class countXO {
    public static boolean getXO(String str) {
        int x = 0, o = 0;
        for (char c : str.toLowerCase().toCharArray()) {
            if (c == 'x') {
                x++;
            } else if (c == 'o') {
                o++;
            }
        }
        return x == o;
    }
    public static void main(String[] args) {
        System.out.println(getXO("xxoo"));
        System.out.println(getXO("xxxoo"));
    }
}
