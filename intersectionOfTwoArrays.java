/*Given two integer arrays nums1 and nums2, return an array of their 
intersection
. Each element in the result must be unique and you may return the result in any order.

 

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.
 */

public class intersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
     if(nums.length > nums2.length){
      int[] temp = nums1;
      nums1 = nums2;
      nums2 = temp;
     }
     Arrays.sort(nums1);

     for (int num : nums1]{
     }
        
    }    

    public static boolean binarySearch ( int[] arr, int target){
         int left = 0; int right = arr.length - 1;
         while (left <= right){
         int mid  = left + (right - left) / 2 ;
         if(arr[mid] == target){
         return true;
         } 
                      else if(arr[mid] > left){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
         }
         return false;
    } 
 }
