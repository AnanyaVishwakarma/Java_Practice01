/*Given a non-empty array of non-negative integers nums, the degree of this array is defined 
as the maximum frequency of any one of its elements.

Your task is to find the smallest possible length of a (contiguous) subarray of nums, that has the same degree as nums.

 

Example 1:

Input: nums = [1,2,2,3,1]
Output: 2
Explanation: 
The input array has a degree of 2 because both elements 1 and 2 appear twice.
Of the subarrays that have the same degree:
[1, 2, 2, 3, 1], [1, 2, 2, 3], [2, 2, 3, 1], [1, 2, 2], [2, 2, 3], [2, 2]
The shortest length is 2. So return 2.
Example 2:

Input: nums = [1,2,2,3,1,4,2]
Output: 6
Explanation: 
The degree is 3 because the element 2 is repeated 3 times.
So [2,2,3,1,4,2] is the shortest subarray, therefore returning 6. */

public class degreeOfAnArray {
    public int findShortestSubArray(int[] nums) {
        int[] count = new int[50000];
        int[] first = new int[50000];
        int[] last = new int[50000];
        int maxCount = 0;
        int degree = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (count[num] == 0) {
                first[num] = i;
                last[num] = i;
                count[num]++;
                maxCount = Math.max(maxCount, count[num]);
            } else {
                last[num] = i;
                count[num]++;
                maxCount = Math.max(maxCount, count[num]);
            }
            if (maxCount == count[num]) {
                degree = Math.max(degree, last[num] - first[num] + 1);
            }
        }
        return degree;
    }

}
