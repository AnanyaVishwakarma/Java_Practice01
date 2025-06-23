/*You are given an array of integers nums and an integer k.
Return the maximum sum of a 
subarray
of nums, such that the size of the subarray is divisible by k.
Example 1:
Input: nums = [1,2], k = 1
Output: 3
Explanation:
The subarray [1, 2] with sum 3 has length equal to 2 which is divisible by 1.
Example 2:
Input: nums = [-1,-2,-3,-4,-5], k = 4
Output: -10
Explanation:
The maximum sum subarray is [-1, -2, -3, -4] which has length equal to 4 which is divisible by 4.
Example 3:
Input: nums = [-5,1,2,-3,4], k = 2
Output: 4
Explanation:
The maximum sum subarray is [1, 2, -3, 4] which has length equal to 4 which is divisible by 2 */
public class maximumSubarraySumWithLengthDivisibleByK {
    public long maxSubarraySum(int[] nums, int k) {
            long maxSum = Long.MIN_VALUE;
            int n = nums.length;
        
            for(int i = 0; i < n; i++){
                for (int j = i; j < n; j++) {
                int len = j - i + 1;
                    if(len % k == 0){
                      long sum = 0;  
                        for(int m = i; m <=j; m++){
                             sum += nums[m];
                            maxSum = Math.max(maxSum, sum);
                        }
                    }
                }
            }
        return maxSum;
    }
        public static void main(String[] args) {
        // Test cases
        int[] nums1 = {1, 2};
        int k1 = 1;
        System.out.println(maxSubarraySum(nums1, k1)); // Output: 3
    }
}
