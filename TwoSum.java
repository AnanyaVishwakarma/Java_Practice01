import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

 public class TwoSum{
    //Time:O(n)
    //Space:O(n)
    static int[] twoSum(int[] nums, int target) {
        Map <Integer, Integer> map = new HashMap<>();
        for (int i = 0;i < nums.length; i++) {
            int current_value = nums[i];
            //current_value + x = target
            //x = target-current_value
            int x = target - current_value;
            if(map.containsKey(x)){
                return new int[] { map.get(x), i};
            }
            map.put(current_value, i);
        }
        return null;
    }
    public void main (String[] args){
        int[] nums = {7, 8, 10, 12, 2, 4};
        int target = 10;
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));

     }
}