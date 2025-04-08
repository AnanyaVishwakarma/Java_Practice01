// Given two strings s and t, return true if t is an anagram of s, and false otherwise.
// Example 1:
// Input: s = "anagram", t = "nagaram"
// Output: true
// Example 2:
// Input: s = "rat", t = "car"
// Output: false
public class validAnagram {   
    public boolean isAnagram(String s, String t) {
        if(s.length() == t.length()){
            char[] sArray = s.toCharArray();
            char[] tArray = t.toCharArray();
            String sortedString = sortingArray(s);
            String sortedString2 = sortingArray(t);
            if(sortedString == sortedString2){
                return true;
            }
        } 
        return false;
    }

    public static void main(String[] args) {
        validAnagram anagram = new validAnagram();
        System.out.println(anagram.isAnagram("anagram", "nagaram"));
    }    
}
