/*You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

 

Example 1:

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
Example 2:

Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]
Explanation: The arrays we are merging are [1] and [].
The result of the merge is [1].
Example 3:

Input: nums1 = [0], m = 0, nums2 = [1], n = 1
Output: [1]
Explanation: The arrays we are merging are [] and [1].
The result of the merge is [1].
Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1. */

import java.util.Arrays;

public class javaMergeSortingArray {
    public void merge(int[] num1, int n, int[] num2, int m){
    public int[] merge(int[] num1, int m, int[] num2, int n){
        //initializing pointers 
     int p1 = m-1;
       int  p2 = n-1;
       int  p = m + n-1;
       
       //Iterating from the back of both the arrays 
        while (p1 >= 0 && p2 >= 0) {
            if (num1[p1] > num2[p2]) {
                num1[p] = num1[p1];
                p1--;
            }else{
                num1[p] = num2[p2];
                p2--;
            }
            p--;
        }

        //If there are remaining elements in num2 thr copy them
        while (p2 >= 0) {
            num1[p] = num2[p2];
            p2--;
            p--;
        }

        //Printing the result from debugging 
        System.out.println(Arrays.toString(num1));        
        return num1;
    }
}
