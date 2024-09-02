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
        HashSet<String>  res = new HashSet<>();
        String[] rows = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        for (String word : words) {
            boolean flag = true;
            for (char c : word.toLowerCase().toCharArray()){
                for (String row : rows) {
                    if (!row.contains(String.valueOf(c))){
                        flag = false;
                        break;
                    }
                }
                if (!flag) break;
            }
            if (flag) res.add(word);
        }
        return res.toArray(new String[0]);
    }    
}
