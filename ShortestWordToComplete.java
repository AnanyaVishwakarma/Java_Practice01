/*Given a string licensePlate and an array of strings words, find the shortest completing word in words.

A completing word is a word that contains all the letters in licensePlate. Ignore numbers and spaces in
 licensePlate, and treat letters as case insensitive. If a letter appears more than once in licensePlate, then 
 it must appear in the word the same number of times or more.

For example, if licensePlate = "aBc 12c", then it contains letters 'a', 'b' (ignoring case), and 'c' twice. 
Possible completing words are "abccdef", "caaacab", and "cbca".

Return the shortest completing word in words. It is guaranteed an answer exists. If there are multiple shortest 
completing words, return the first one that occurs in words.

 

Example 1:

Input: licensePlate = "1s3 PSt", words = ["step","steps","stripe","stepple"]
Output: "steps"
Explanation: licensePlate contains letters 's', 'p', 's' (ignoring case), and 't'.
"step" contains 't' and 'p', but only contains 1 's'.
"steps" contains 't', 'p', and both 's' characters.
"stripe" is missing an 's'.
"stepple" is missing an 's'.
Since "steps" is the only word containing all the letters, that is the answer.
Example 2:

Input: licensePlate = "1s3 456", words = ["looks","pest","stew","show"]
Output: "pest"
Explanation: licensePlate only contains the letter 's'. All the words contain 's', but among these 
"pest", "stew", and "show" are shortest. The answer is "pest" because it is the word that appears earliest of the 3. */

import java.util.HashMap;
import java.util.Map;

public class ShortestWordToComplete {
    public String shortestCompletingWord(String licensePlate, String[] words) {

        String processedLicensPlate = licensePlate.replaceAll("[^a-zA-Z]", "").toLowerCase();
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : processedLicensPlate.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        String shortestWord = null;
        for (String word : words) {
            Map<Character, Integer> wordFreqMap = new HashMap<>();
            for (char c : word.toLowerCase().toCharArray()) {
                wordFreqMap.put(c, wordFreqMap.getOrDefault(c, 0) + 1);
            }
            boolean isCompletingWord = true;
            for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
                if (!wordFreqMap.containsKey(entry.getKey()) || wordFreqMap.get(entry.getKey()) < entry
                .getValue()) {
                    isCompletingWord = false;
                    break;
                    }
                    }
                    if (isCompletingWord && (shortestWord == null || word.length() < shortestWord.length())) {
                        shortestWord = word;
                        }
        }
        return shortestWord;
    }
}
