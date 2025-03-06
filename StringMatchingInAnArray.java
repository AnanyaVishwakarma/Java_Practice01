/*Given an array of string words, return all strings in words that are a substring of another word. \
You can return the answer in any order.
Example 1:

Input: words = ["mass","as","hero","superhero"]
Output: ["as","hero"]
Explanation: "as" is substring of "mass" and "hero" is substring of "superhero".
["hero","as"] is also a valid answer.
Example 2:

Input: words = ["leetcode","et","code"]
Output: ["et","code"]
Explanation: "et", "code" are substring of "leetcode".
Example 3:

Input: words = ["blue","green","bu"]
Output: []
Explanation: No string of words is substring of another string. */


public class StringMatchingInAnArray {
    public List<String> stringMatching(String[] words) {
        List<String> result = new ArrayList<>();
        for(String str: words){
            for(String another: words){
               if (str.equals(another)){
                   continue;
               }
                if(another.contains(str)){
                    result.add(str);
                }
            }
        }
        return result;
    }      
    public static void main (String[] args){
        StringMatchingInAnArray obj = new StringMatchingInAnArray();    
        String[] words = {"mass","as","hero","superhero"};
        List<String> result = obj.stringMatching(words);
        System.out.println(result);
        String[] words2 = {"leetcode","et","code"};
        List<String> result2 = obj.stringMatching(words2);        
        
    }
}
