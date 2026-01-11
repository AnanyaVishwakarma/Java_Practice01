/*You are given a string s consisting of lowercase English letters.
Return an integer denoting the maximum number of substrings you can split s into such that each substring starts with a distinct character (i.e., no two substrings start with the same character).
Example 1:
Input: s = "abab"
Output: 2
Explanation:
Split "abab" into "a" and "bab".
Each substring starts with a distinct character i.e 'a' and 'b'. Thus, the answer is 2.
Example 2:
Input: s = "abcd"
Output: 4
Explanation:
Split "abcd" into "a", "b", "c", and "d".
Each substring starts with a distinct character. Thus, the answer is 4.
Example 3:
Input: s = "aaaa"
Output: 1
=======
Output: 
Explanation:
All characters in "aaaa" are 'a'.
Only one substring can start with 'a'. Thus, the answer is 1.
Constraints:
1 <= s.length <= 105
s consists of lowercase English letters. */

import java.util.Scanner;
public class maximumSubstringsWithDistinctStart {
    public int maxDistinct(String s) {
        int n = s.length();
        int count = 0;
        for (int i = 0; i < n; i++){
            if(s.charAt(0) == s.charAt(1)){
                count++;
            }           
        }
        return count;
    }    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        maximumSubstringsWithDistinctStart obj = new maximumSubstringsWithDistinctStart();
        String s = sc.next();
        System.out.println(obj.maxDistinct(s));
    }
}
