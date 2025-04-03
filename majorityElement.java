/*Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times. 
You may assume that the majority element always exists in the array.
Example 1:
Input: nums = [3,2,3]
Output: 3
Example 2:
Input: nums = [2,2,1,1,1,2,2]
Output: 2
*/
import java.util.HashMap;
import java.util.Map;

public class majorityElement {
    public int majorityElementInTheArray(int[] nums) {
        Map<Integer, Integer> track = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(track.containsKey(nums[i])){
                track.put(nums[i], track.get(nums[i]) + 1);
            } else {
                track.put(nums[i], 1);
            }
        }  
        return -1;
    }    
    public static void main(String[] args){
        majorityElement me = new majorityElement();
        int[] nums = {3,2,3};
        int[] num = {2,2,1,1,1,2,2};        
        System.out.Println(me.majorityelementInTheArray(nums));
        System.out.Println(me.majorityelementInTheArray(num));

    }
}
