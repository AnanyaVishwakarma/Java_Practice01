/*Given an integer array nums, return the third distinct maximum number in this array. 
If the third maximum does not exist, return the maximum number.

Example 1:

Input: nums = [3,2,1]
Output: 1
Explanation:
The first distinct maximum is 3.
The second distinct maximum is 2.
The third distinct maximum is 1.
Example 2:

Input: nums = [1,2]
Output: 2
Explanation:
The first distinct maximum is 2.
The second distinct maximum is 1.
The third distinct maximum does not exist, so the maximum (2) is returned instead.*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class thirdMaximumNumber {
    public int thirdMax(int[] nums) {
        // create a hashset to store UNIQUE numbers from nums[]
        HashSet<Integer> set = new HashSet<>();
        // iterae through nums[] and add each number to the hashset
        for (int num : nums) {
            set.add(num);
        }
        // converting the set into list or array
        List<Integer> list = new ArrayList<>(set);
        // sorting the list in reverse/descending order
        Collections.sort(list, Collections.reverseOrder());
        // if list has atleast 3 elements,return the 3rd element
        if (list.size() >= 3) {
            return list.get(2);
        }
        // else return the max. number (which will be the first element in the sorted
        // list)
        else {
            return list.get(0);
        }

    }

}
