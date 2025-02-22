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
     int low = 0; int high = s.length();
     List<Integer> perm = new ArrayList<>();        
     for(int i = low; i <= high; i++){
        if(i == 'I'){
            perm.add(i);
            low++;
        } 
         
     }
    }
    public static void main(String[] args) {

    }
    
}
