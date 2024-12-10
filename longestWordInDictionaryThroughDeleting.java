/*Given a string s and a string array dictionary, return the longest string in 
the dictionary that can be formed by deleting some of the given string characters. 
If there is more than one possible result, return the longest word with the smallest 
lexicographical order. If there is no possible result, return the empty string. 

Example 1:

Input: s = "abpcplea", dictionary = ["ale","apple","monkey","plea"]
Output: "apple"
Example 2:

Input: s = "abpcplea", dictionary = ["a","b","c"]
Output: "a" */

import java.util.List;

public class longestWordInDictionaryThroughDeleting {
    public String findLongestWord(String s, List<String> dictionary) {
        Collections.sort(dictionary, (a, b) -> {
            if(a.length() != b.length()){
                return b.length() - a.length();
            }
            return a.compareTo(b);
        });        
    }
            for (String word : dictionary){
            if (isSubsequence(word, s)) {
                return word;
            }
        }
        return "";
    }
    private static boolean isSubsequence(String words, String s){
         int i = 0, j =0;
                while(i < words.length() && j < s.length()){
                    if (words.charAt(i) == s.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == words.length();
    }
}
