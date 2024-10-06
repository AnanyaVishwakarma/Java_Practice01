
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/*You are given an array of strings names, and an array heights that consists of distinct positive integers. 
Both arrays are of length n.

For each index i, names[i] and heights[i] denote the name and height of the ith person.

Return names sorted in descending order by the people's heights.

Example 1:

Input: names = ["Mary","John","Emma"], heights = [180,165,170]
Output: ["Mary","Emma","John"]
Explanation: Mary is the tallest, followed by Emma and John.
Example 2:

Input: names = ["Alice","Bob","Bob"], heights = [155,185,150]
Output: ["Bob","Alice","Bob"]
Explanation: The first Bob is the tallest, followed by Alice and the second Bob */

public class SortThePeople {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        Map<Integer, String> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            map.put(heights[i], names[i]);
        }

        Integer[] sortedHeights = Arrays.stream(heights).boxed().toArray(Integer[]:: new);
        Arrays.sort(sortedHeights, Collections.reverseOrder());

        String[] sortedNames = new String[n];
        for (int i = 0; i < n; i++){
            sortedNames[i] = map.get(sortedHeights[i]);
        }
        return sortedNames;
    }    
}
