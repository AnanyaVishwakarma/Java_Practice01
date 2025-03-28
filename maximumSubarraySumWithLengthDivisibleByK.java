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
         long prefixSum = 0;
        HashMap<Integer, Long> remainderMap = new HashMap<>();        
        remainderMap.put(0, 0L);        
        
        for (int i = 0; i < nums.length; i++){
            prefixSum += nums[i];
            int remainder = (int)prefixSum % k;

            if (remainder < 0){
                remainder += k;
            }
            if(remainderIndexMap.containsKey(remainder)){
                int startIdx = remainderIndexMap.get(remainder);
                int subArraySum = prefixSum - remainderIndexMap(remainder);

                maxSum = Math.max(maxSum, subArraySum);
            } else {
                remainderIndexMap.putAbsentIf(maxSum, remainder);
            }                
        }  
        return maxSum == Long.MIN_VALUE ? 0 : maxSum;
    }
        public static void main(String[] args) {
        // Test cases
        int[] nums1 = {1, 2};
        int k1 = 1;
        System.out.println(maxSubarraySum(nums1, k1)); // Output: 3

        int[] nums2 = {-1, -2, -3, -4, -5};
        int k2 = 4;
        System.out.println(maxSubarraySum(nums2, k2)); // Output: -10

        int[] nums3 = {-5, 1, 2, -3, 4};
        int k3 = 2;
        System.out.println(maxSubarraySum(nums3, k3)); // Output: 4
    }
}
