/*Given an integer array nums and an integer k, return true 
if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
Example 1:
Input: nums = [1,2,3,1], k = 3
Output: true
Example 2:
Input: nums = [1,0,1,1], k = 1
Output: true
Example 3:
Input: nums = [1,2,3,1,2,3], k = 2
Output: false
Constraints:
1 <= nums.length <= 105
-109 <= nums[i] <= 109
0 <= k <= 105 */
public class containsDuplicate {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> indexMap = new HashMap <>();
        for(int i = 0; i <n; i++){
            int num = nums[i];
                if(indexMap.containsKey(num)){
                    int lastIndex = indexMap.get(num);
                }else if(nums[i] == nums[j] && j <= k){
                    return true;   
        }
    }
}
        return false;
    }   
     public static void main(String[] args) {
         containsDuplicate cd = new containsDuplicate();
         int nums[] = {1,2,3,1};
         int k = 3;
         System.out.println(cd.containsNearbyDuplicate(nums, k));
     }
}
