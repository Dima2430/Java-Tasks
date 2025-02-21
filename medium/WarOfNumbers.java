package medium;
public class WarOfNumbers {

  public static String compare(int[] arr){
    int even = 0;
    int odd =0;
   for(int num : arr){
     if(num % 2 == 0){
       even+=num;
     }else{
       odd+= num;
     }
   } 
    return even > odd ? "even won" : "odd won";
  }
  public static void main(String[] args){
    System.out.println(compare(new int[] {5, 9, 45, 6, 2, 7, 34, 8, 6, 90, 5, 243}));
  }
}
