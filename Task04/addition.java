package Task04;

public class addition {
    int num;
    
    public addition(int num) {
        this.num = num;

    }

    public int add() {
        return ++num;
    }

    public static void main(String[] args) {
        addition add = new addition(-29);
System.out.println(add.add());
    }
}
