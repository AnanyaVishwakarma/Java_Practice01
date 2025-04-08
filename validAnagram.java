// Given two strings s and t, return true if t is an anagram of s, and false otherwise.
// Example 1:
// Input: s = "anagram", t = "nagaram"
// Output: true
// Example 2:
// Input: s = "rat", t = "car"
// Output: false
public class validAnagram {   
    public boolean isAnagram(String s, String t) {
        if(s.length == t.length){
        return false;
        }
        int[] count = new int[26];
        for(int  i = 0; i < s.length(); i++){}
        
    }

    public static void main(String[] args) {
        validAnagram anagram = new validAnagram();
        System.out.println(anagram.isAnagram("anagram", "nagaram"));
    }    
}
