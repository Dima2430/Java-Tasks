 package easy;
public class Convert {
    int minutesToConvert;

    public Convert(int minutesToConvert) {
        this.minutesToConvert = minutesToConvert;
    }

    public int ConvertToSec() {
        return minutesToConvert * 60;
    }

    public static void main(String[] args) {
    Convert seconds = new Convert(98);
    System.out.println(seconds.ConvertToSec());
}
}
