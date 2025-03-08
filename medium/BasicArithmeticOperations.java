package medium;
public class BasicArithmeticOperations {
public static int operation(String num1, String num2, String op) {
int number1 = Integer.parseInt(num1);
int number2 = Integer.parseInt(num2);
if(op.equals("add")){
return number1 + number2;
}else if(op.equals("subtract")){
return number1 - number2;
}else if(op.equals("multiply")){
return number1 * number2;
 }else if(op.equals("divide")){
return number1 / number2;
}else{
throw new IllegalArgumentException("Invalid operation: " + op);
}
}
public static void main(String[] args){
System.out.println(operation("1","2","add"));
}
}