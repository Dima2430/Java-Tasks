package easy;


public class Addition {
    int num;
    
    public Addition(int num) {
        this.num = num;

    }

    public int add() {
        return ++num;
    }

    public static void main(String[] args) {
        Addition add = new Addition(-29);
System.out.println(add.add());
    }
}
