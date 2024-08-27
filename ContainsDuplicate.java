/*Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

 

Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true */

public class ContainsDuplicate {
    public boolean ContainsDuplicate(int[] nums){
        for (int i = 0; i < nums.length; i++) {
             for (int j = 0; j < nums.length; j++) {
                if(i != j && nums[i] == nums[j]){
                    return true;
                }
             }
        }
        return false;
    }
}
