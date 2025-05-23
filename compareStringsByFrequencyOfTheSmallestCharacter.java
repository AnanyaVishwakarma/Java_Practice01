import java.util.Arrays;

/*Let the function f(s) be the frequency of the lexicographically smallest character in a non-empty string s. 
For example, if s = "dcce" then f(s) = 2 because the lexicographically smallest character is 'c', which has a frequency of 2.
You are given an array of strings words and another array of query strings queries. 
For each query queries[i], count the number of words in words such that f(queries[i]) < f(W) for each W in words.
Return an integer array answer, where each answer[i] is the answer to the ith query.
Example 1:

Input: queries = ["cbd"], words = ["zaaaz"]
Output: [1]
Explanation: On the first query we have f("cbd") = 1, f("zaaaz") = 3 so f("cbd") < f("zaaaz").
Example 2:

Input: queries = ["bbb","cc"], words = ["a","aa","aaa","aaaa"]
Output: [1,2]
Explanation: On the first query only f("bbb") < f("aaaa"). On the second query both f("aaa") and f("aaaa") are both > f("cc").
  */

public class compareStringsByFrequencyOfTheSmallestCharacter {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
     int[] wordFreq = new int[words.length];
      for (int i = 0; i < words.length; i++){
        wordFreq[i] = frequencyOfTheSmallestCharacter(words[i]);      
      }
      Arrays.sort(wordFreq);
     int[] answer = new int[queries.length];   
      for(int i = 0; i < queries.length; i++){
         int queryFreq = frequencyOfTheSmallestCharacter(queries[i]);    
               answer[i] = countGreater(wordFreq, queryFreq);
      }     
     return answer;
    }    
 public int getFrequency(String s){
  char minChar = 'z';
  int count = 0;
  for(char c: s.toCharArray()){
   if(c < minChar){
       minChar = c;   
    count = 1;
   } else if(c == minChar){
    count++;
   }
  }
   return count;
 }
 private int countGreater(int[] sortedFreq, int queryFreq){
  int left = 0; int right = sortedFreq.length;
        while(left < right){
        int mid = left + (right -left) /2;
         if(sortedFreq[mid] > queryFreq){
          right = mid;
         } else {
          left = mid + 1;
         }
        }
  return sortedFreq.length - left;
 }
 private String[] sortedArray(String[] arr){
       char[] temp = new char[arr.length];
      for(int i = 0; i < arr.length; i++){}     
 }
     public static void main(String[] args){
      compareStringsByFrequencyOfTheSmallestCharacter solution = new compareStringsByFrequencyOfTheSmallestCharacter();      
      compareStringsByFrequencyOfTheSmallestCharacter solution2 = new compareStringsByFrequencyOfTheSmallestCharacter();
      String[] queries = {"bbb","cc"};
      String[] words = {"a","aa","aaa","aaaa"};
      System.out.println(Arrays.toString(solution.numSmallerByFrequency(queries, words)));            
      
     }
}
