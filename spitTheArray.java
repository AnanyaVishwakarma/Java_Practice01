
/**
 * You are given an integer array nums of even length. You have to split the array into two parts nums1 and nums2 such that:

 *  *nums1.length == nums2.length == nums.length / 2.
 * nums1 should contain distinct elements.
 * nums2 should also contain distinct elements.
 * Return true if it is possible to split the array, and false otherwise.
 *
 *

 *  *Example 1:

 *  *Input: nums = [1,1,2,2,3,4]
 * Output: true
 * Explanation: One of the possible ways to split nums is nums1 = [1,2,3] and nums2 = [1,2,4].
 * Example 2:

 *  *Input: nums = [1,1,1,1]
 * Output: false
 * Explanation: The only possible way to split nums is nums1 = [1,1] and nums2 = [1,1]. Both nums1 and nums2 do not
 * contain distinct elements. Therefore, we return false. */
public class spitTheArray {

    public boolean isPossibleToSplit(int[] nums) {
        int midpoint = nums.length / 2;
        int[] nums1 = new int[midpoint];
        int[] nums2 = new int[midpoint];
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count1 < midpoint) {
                if (count2 < midpoint) {

                    if (nums[i] != nums2[count2]) {
                        nums1[count1] = nums[i];
                        count1++;
                    } else if (nums[i] == nums2[count2]) {
                        count2++;
                    }
                } else if (count2 < midpoint) {
                    nums2[count2] = nums[i];
                    count2++;
                }
            }

        }
        return count1 == midpoint && count2 == midpoint;
    }

}
