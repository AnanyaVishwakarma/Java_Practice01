/*You are given a 0-indexed integer array nums and a target element target.
A target index is an index i such that nums[i] == target.
Return a list of the target indices of nums after sorting nums in 
non-decreasing order. If there are no target indices, return an empty list. The returned list must be sorted in increasing order. 
Example 1:
Input: nums = [1,2,5,2,3], target = 2
Output: [1,2]
Explanation: After sorting, nums is [1,2,2,3,5].
The indices where nums[i] == 2 are 1 and 2.
Example 2:

Input: nums = [1,2,5,2,3], target = 3
Output: [3]
Explanation: After sorting, nums is [1,2,2,3,5].
The index where nums[i] == 3 is 3.
Example 3:

Input: nums = [1,2,5,2,3], target = 5
Output: [4]
Explanation: After sorting, nums is [1,2,2,3,5].
The index where nums[i] == 5 is 4. */
import java.util.ArrayList;
import java.util.List;

public class findTargetIndicesAfterSortingArray {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> resultList = new ArrayList<>();
        Arrays.sort(nums);
        int first = firstIndex(nums, target);
        if(first == -1){
            return resultList;
        }
        int last = lastIndex(nums, target);
        for (int i = first; i <= last; i++){
            resultList.add(i);
        }
        return resultList;
    }
    private int firstIndex (int[] nums, int target){
     int start =0; int end = nums.length-1;
        while(start <= end){
        int mid = start + (end - start)/2;
            if(target == nums[mid]){
                first = mid;
                end = mid - 1;                
            } else if (target < nums[mid]){
                end = mid - 1;
            } else {
                start = mid + 1;
            } 
        }
        return first;
    }
    private int lastIndex (int[] nums, int target){
     int start = 0; int end = nums.length-1; int last = -1;
        while(start <= end){
        int mid = start + (end - start)/2;
            if(nums[mid] == target){
              last = mid;
              start = mid +1;
            } else if (nums[mid] < target){
                start =  mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return last;
    }
    public static void main (String[] args){
        int[] arr = {1,2,5,2,3};
        System.out.println(targetIndices(arr, 2));
        System.out.println(targetIndices(arr, 3));
        System.out.println(targetIndices(arr, 5));     
    }
    
}
