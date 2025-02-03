package easy;
class countWords {
public static int countF(String str) {
return str.split(" ").length;
}
public static void main(String[] args) {
System.out.println(countWords.countF("Just an example here move along"));
}
}