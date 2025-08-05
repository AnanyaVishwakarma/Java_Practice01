/*The Fibonacci sequence is a series of numbers where each number is the sum of the two preceding ones, 
typically starting with 0 and 1. The sequence begins: 0, 1, 1, 2, 3, 5, 8, 13, 21, and so on.*/
import java.util.*;

public class FibonnacciSequence {
    public int[] fibonacciSeries (int n){
        int[] nums = new int[n];
        if(n >= 1) nums[0] = 0;
        if(n >= 2) nums[1] = 1;

        for(int i = 2; i < n; i++){
            nums[i] = nums[i-1] + nums[i -2];
        }
        return nums;
        }
    }    
}
