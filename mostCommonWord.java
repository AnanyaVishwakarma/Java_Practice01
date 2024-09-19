/*Given a string paragraph and a string array of the banned words banned, return the most frequent word that 
is not banned. It is guaranteed there is at least one word that is not banned, and that the answer is unique.

The words in paragraph are case-insensitive and the answer should be returned in lowercase.

 

Example 1:

Input: paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.", banned = ["hit"]
Output: "ball"
Explanation: 
"hit" occurs 3 times, but it is a banned word.
"ball" occurs twice (and no other word does), so it is the most frequent non-banned word in the paragraph. 
Note that words in the paragraph are not case sensitive,
that punctuation is ignored (even if adjacent to words, such as "ball,"), 
and that "hit" isn't the answer even though it occurs more because it is banned.
Example 2:

Input: paragraph = "a.", banned = []
Output: "a" */

public class mostCommonWord {
 public String mostCommonWord(String paragraph, String[] banned) {
    String[] words = paragraph.toLowerCase().split("[^\\w\\s]+");

    Set<String> set = new HashSet<>(Arrays.asList(banned));
        
    Map<String, Integer> map = new HashMap<>();
    for (String word : words) {
        if (!set.contains(word)) {
            if (map.containsKey(word)) {
                int freq = map.get(word) + 1;
                map.put(word, freq);
            } else {
                map.put(word, 1);
            }
        } // This bracket was missing
    }
    
    String mostFreq = null;
    int max = 0;
    for (Map.Entry<String, Integer> entry : map.entrySet()) {
        if (entry.getValue() > max) {
            max = entry.getValue();
            mostFreq = entry.getKey();
        }
    }
    return mostFreq;
}   
}
