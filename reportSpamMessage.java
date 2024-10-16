
import java.util.HashSet;
import java.util.Set;

/*You are given an array of strings message and an array of strings bannedWords.

An array of words is considered spam if there are at least two words in it that exactly match any word in bannedWords.

Return true if the array message is spam, and false otherwise.

 

Example 1:

Input: message = ["hello","world","leetcode"], bannedWords = ["world","hello"]

Output: true

Explanation:

The words "hello" and "world" from the message array both appear in the bannedWords array.

Example 2:

Input: message = ["hello","programming","fun"], bannedWords = ["world","programming","leetcode"]

Output: false

Explanation:

Only one word from the message array ("programming") appears in the bannedWords array */
public class reportSpamMessage {
    public boolean reportSpam(String[] message, String[] bannedWords) {

        Set<String> bannedSet = new HashSet<>();

        for ( String word : bannedWords){
            bannedSet.add(word);
        }
        
        int count = 0;
        for (String word : message) {
            if (bannedSet.contains(word)){
                count++;
            }
        }
        if (count >= 2){
            return true;
        }
        return  false;
    }    
}
