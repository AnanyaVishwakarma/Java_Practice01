/*Given an array of strings words, return the words that can be typed using letters of the alphabet on only one row of American keyboard like the image below.

In the American keyboard:

the first row consists of the characters "qwertyuiop",
the second row consists of the characters "asdfghjkl", and
the third row consists of the characters "zxcvbnm".

 

Example 1:

Input: words = ["Hello","Alaska","Dad","Peace"]
Output: ["Alaska","Dad"]
Example 2:

Input: words = ["omk"]
Output: []
Example 3:

Input: words = ["adsdf","sfd"]
Output: ["adsdf","sfd"] */

import java.util.HashSet;

public class keyboardRow {
    public String[] findWords(String[] words) {
    public  boolean canBeTypedInOneRow(String word, String row)  {
        for(char c : word.toCharArray()){
            if(row.indexOf(c) == -1) return false;
        }
        return  true;
    }
    public String[] findWords(String[] words) {
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        List<String> result = new ArrayList<>();

        for (String word : words) {
            String lowerWord = word.toLowerCase();

            if(canBeTypedInOneRow(lowerWord, row1) || canBeTypedInOneRow(lowerWord, row2) || canBeTypedInOneRow(lowerWord, row3)){
                result.add(word);
            }
        }
        return result.toArray(new String[0]);
    }   
}
