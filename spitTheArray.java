
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
        int n = nums.length;

        if(n % 2 != 0){
            return false;
        }

        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums){
          freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);        
        }

        for(int count : freqMap.values()){
          if(count > 2){
            return false;
          }
        }

        Set<Integer> set1 = new HashSet<>(); 
        Set<Integer> set2 = new HashSet<>();
         
        for(int num : nums){
          if (set1.size() < n / 2 && !set1.contains(num)) {
            set1.add(num);
          }else{
            set2.add(num);
          }
        }
       return  set1.size() == n /2 && set2.size() == n / 2;
    }

}
