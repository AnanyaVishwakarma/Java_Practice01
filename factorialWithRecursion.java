import java.util.*;

public class factorialWithRecursion {
    public int checkFactorial(int n){
        if(n <= 1){
            return n;
        }
        return checkFactorial(n*(n-1));
     }
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     factorialWithRecursion obj = new factorialWithRecursion(); }    
}








