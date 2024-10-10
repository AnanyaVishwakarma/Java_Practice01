
import java.util.HashMap;
import java.util.Map;

/*Given a string array words, return an array of all characters that show up in all strings within the words 
(including duplicates). You may return the answer in any order.

 

Example 1:

Input: words = ["bella","label","roller"]
Output: ["e","l","l"]
Example 2:

Input: words = ["cool","lock","cook"]
Output: ["c","o"] */

public class findCommonCharacters {
    public List<String> commonChars(String[] words) {
       List<String> result = new ArrayList<>();

        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c  : words[0].toCharArray()){
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        for (int i =0; i < words.length; i++){
            Map<Character, Integer> wordMap = new HashMap<>();
            for(char c : words[i].toCharArray()){
                wordMap.put(c, wordMap.getOrDefault(c, 0) + 1);
            }

            for ( char c: freqMap.keySet()){
                if (wordMap.containsKey(c)){
                    freqMap.put(c, Math.min(freqMap.get(c), wordMap.get(c)));
                } else{
                    freqMap.put(c, 0);
                }
            }
            

        }


    }    
}
