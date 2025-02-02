rn /*Given an array of integers nums sorted in non-decreasing order, 
find the starting and ending position of a given target value.
If target is not found in the array, return [-1, -1].
You must write an algorithm with O(log n) runtime complexity.
Example 1:
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:
Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
Example 3:
Input: nums = [], target = 0
Output: [-1,-1] */

public class findFirsAndLAstPositionOfElementInSortedArray {
    public int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums, target);
        int last = findLast(nums, target);

        return new int[]{first, last};
    }
    private static int findFirst(int[] nums, int target){
        int start = 0; int end = nums.length - 1; int first = -1;
        while (start <= end){
        int mid =  start + (end - start) / 2;
            if(nums[mid] == target){
                first = mid;
                end = mid - 1;
            } else if (nums[mid) < target{
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return first;
    }
    private static int findLast (int[] nums, int target){
        int start = 0; int end = nums.length - 1; int last = -1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if(nums[mid] == target){
               last = mid;
               end = mid - 1; 
            } if (nums[mid] > target){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return last;
    }
        public static void main(String[] args) {
        int[] arr1 = {5,7,7,8,8,10};
        int target =  8;
        System.out.println(Arrays.toString(searchRange(arr1, target)));
        int[] arr2 = {5,7,7,8,8,10};
        int target2 =  7;
        System.out.println(Arrays.toString(searchRange(arr2, target2)));
    }
}
