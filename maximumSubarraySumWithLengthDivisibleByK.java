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
        HashMap<Integer, Integer> remainderIndexMap = new HashMap<>();
        remainderIndexMap.put(0, -1);

        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < nums.length; i++){
            currentSum += nums[i];
            int remainder = currentSum % k;

            if (remainder < 0){
                remainder += k;
            }
            if(remainderIndexMap.containsKey(remainder)){
                int startIdx = remainderIndexMap.get(remainder);
                int subArraySum = currentSum - (startIdx == -1 ? 0: nums[startIdx]);            
        }  
        return maxSum;
    }
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum Subarray Sum: " + maxSubarraySum(nums));
    }    
}
