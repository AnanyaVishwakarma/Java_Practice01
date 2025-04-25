import java.util.ArrayList;
import java.util.List;

/*Given an input string s, reverse the order of the words.
A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
Return a string of the words in reverse order concatenated by a single space.
Note that s may contain leading or trailing spaces or multiple spaces between two words. 
The returned string should only have a single space separating the words. Do not include any extra spaces.
Example 1:

Input: s = "the sky is blue"
Output: "blue is sky the"
Example 2:

Input: s = "  hello world  "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.
Example 3:

Input: s = "a good   example"
Output: "example good a"
Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.*/

public class reverseWordsInAString {
    public String reverseWords(String s) {
    List<String> words = new ArrayList<>();
    StringBuilder word = new StringBuilder();    

    int n = s.length();
    int index = 0;

     while ( index < n &&  s.charAt(index) == ' '){
         index++;
     }
     while (index < n) { 
     char c =s.charAt(index);
         if(c != ' '){
             word.append(c);
         } else{
             if(word.length() > 0){
                 words.add(word.tostring());
                  word.setLength(0);                
             }
             while(){}
         }
     }
   
        return s;
    }    
        public static void main(String[] args) {
        reverseWordsInAString rs = new reverseWordsInAString();
        String input = "  hello world  ";   
        System.out.println(rs.reverseWords(input));            
    } 
}
