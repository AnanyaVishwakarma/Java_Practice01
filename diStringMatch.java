/*A permutation perm of n + 1 integers of all the integers in the range [0, n] can be represented as a string s of length n where:
s[i] == 'I' if perm[i] < perm[i + 1], and s[i] == 'D' if perm[i] > perm[i + 1].
Given a string s, reconstruct the permutation perm and return it. If there are multiple valid permutations perm, return any of them.

Example 1:
Input: s = "IDID"
Output: [0,4,1,3,2]

Example 2:
Input: s = "III"
Output: [0,1,2,3]

Example 3:
Input: s = "DDI"
Output: [3,2,0,1] */

public class diStringMatch {
    public int[] diStringMatch(String s) {
        int n = s.length();
     int low = 0; int high = s.length();
     int[] perm = new int[n+1];
        
     for(int i = 0; i < n; i++){
        if(s.charAt(i) == 'I'){
            perm[i] = low;
            low++;
        } else {
            perm[i] = high;
            high--;
        }  
     }
        perm[n] = low;
        return perm;
    }
    public static void main(String[] args) {
        String s = "IDID";
        System.out.println(Arrays.toString(diStringMatch(s)));
        String s1 = "III";
        System.out.println(Arrays.toString(diStringMatch(s)));
        String s2 = "DDI";
        System.out.println(Arrays.toString(diStringMatch(s)));
    }
    
}
