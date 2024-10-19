/*Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

 

Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
Example 2:

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100] */


public class rotateArray {
    public void rotate(int[] nums, int k) {
        int n = nums.length;

        int[] temp = new int[k];
        
        for(int i = 0; i < n; i++){
            temp[i] = nums[n - k + i];
        }

        for ( int i = n-1; i >= k; i--){
            nums[i] = nums [i -k];
        }        
        for(int i =0; i<n; i++){
            nums[i] = temp[i];
        }
    }
    static void printArray(int nums[]){
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
