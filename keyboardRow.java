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
        Set<Character> ROW1 = new HashSet<>(Arrays.asList('q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'));
        Set<Character> ROW2 = new HashSet<>(Arrays.asList('a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l'));
        Set<Character> ROW3 = new HashSet<>(Arrays.asList('z', 'x', 'c', 'v', 'b', 'n', 'm'));
        Set<Set<Character>> rows = new HashSet<>(Arrays.asList(ROW1, ROW2, ROW3));

        Set<String> res = new HashSet<>();

        for (String word : words) {
            Set<Character> wordSet = new HashSet<>();
            for (char c : word.toLowerCase().toCharArray()) {
                wordSet.add(c);
            }
            for (Set<Character> row : rows) {
                if (row.containsAll(wordSet)) {
                    res.add(word);
                    break;
                }
            }
        }
        return res.toArray(new String[0]);
    }    
}
