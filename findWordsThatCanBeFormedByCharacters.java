/*You are given an array of strings words and a string chars.
A string is good if it can be formed by characters from chars (each character can only be 
used once).
Return the sum of lengths of all good strings in words.
Example 1:
Input: words = ["cat","bt","hat","tree"], chars = "atach"
Output: 6
Explanation: The strings that can be formed are "cat" and "hat" so the answer is 3 + 3 = 6.
Example 2:
Input: words = ["hello","world","leetcode"], chars = "welldonehoneyr"
Output: 10
Explanation: The strings that can be formed are "hello" and "world" so the answer is 5 + 5 = 10. */

public class findWordsThatCanBeFormedByCharacters {
    public int countCharacters(String[] words, String chars) {
        HashMap<Characters, Integer> charCountMap = new HashMap<>();
        for(char ch: chars.toCharArray()){
                charCountMap.put(word, charCountMap.getOrDefault(word, 0) + 1);
            }
        int totalLength = 0;
        HashMap<Character, Integer> wordMap = new HashMap<>();
         for(String word: words){
            for(char ca: word.toCharArray()){
                wordMap.put(ca, wordMap.getOrDefault(ca, 0) + 1);
            }
        }
        boolean canBeFormed = true;
        for(char ch: word.toCharArray()){
        if(wordMap.get(ch) > charCountMap.getOrDefault(ch, 0){
            canBeFormed = false;
        }
     }
        if()
         
    
}
