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
        private String sortingArray(String s){
            char[] sArray = s.toCharArray();
            int size = sArray.length;
            for(int i = 0; i < size; i++){
                for(int j = 0; j < size - i - 1; j++){
                    if(sArray[j] > sArray[j+1]){
                        char temp = sArray[j];
                        sArray[j] = sArray[j+1];
                        sArray[j+1] = temp;
                    }
                }  
                System.out.println();
            }
        return Arrays.toString(sArray);
    } 
}
