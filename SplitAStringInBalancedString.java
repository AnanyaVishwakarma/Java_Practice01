/*Balanced strings are those that have an equal quantity of 'L' and 'R' characters.
Given a balanced string s, split it into some number of substrings such that:
Each substring is balanced.
Return the maximum number of balanced strings you can obtain.
Example 1:
Input: s = "RLRRLLRLRL"
Output: 4
Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.
Example 2:
Input: s = "RLRRRLLRLL"
Output: 2
Explanation: s can be split into "RL", "RRRLLRLL", each substring contains same number of 'L' and 'R'.
Note that s cannot be split into "RL", "RR", "RL", "LR", "LL", because the 2nd and 5th substrings are not balanced.
Example 3:
Input: s = "LLLLRRRR"
Output: 1
Explanation: s can be split into "LLLLRRRR". */
import java.util.*;
public class SplitAStringInBalancedString {
    public int balancedStringSplit(String s) {
        int n = s.length();
        String[] arr = new String[n];
        char[] chArray = s.toCharArray();
        int count = 0;
        for(int i = 1; i < n-1; i++){
             if(chArray[i] != chArray[i - 1]){
                String concatinate = "" + chArray[i-1] + chArray[i];
                count++;
        }
      }
        return count;
    }    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SplitAStringInBalancedString obj = new SplitAStringInBalancedString();
        String s = sc.next();
        System.out.println(obj.balancedStringSplit(s));        
    }    
}











