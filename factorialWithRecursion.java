import java.util.*;

public class factorialWithRecursion {
    public int checkFactorial(int n){
        if(n <= 1){
            return n;
        }
        return checkFactorial(n*(n-1));
     }
    
}





