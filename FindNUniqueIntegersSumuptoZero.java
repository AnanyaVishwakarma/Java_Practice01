/*Given an integer n, return any array containing n unique integers such that they add up to 0.
Example 1:
Input: n = 5
Output: [-7,-1,1,3,4]
Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].
Example 2:
Input: n = 3
Output: [-1,0,1]
Example 3:
Input: n = 1
Output: [0]
Constraints:
1 <= n <= 1000 */
import java.util.*;
import java.math.*;
public class FindNUniqueIntegersSumuptoZero {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        int index = 0;
        for(int i = 1; index + 1 < n; i++){
            ans[index++] = i;
            ans[index++] = -i;
            }
        if(index < n) ans[index] = 0;
        return ans;
    }

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    }   
}
























