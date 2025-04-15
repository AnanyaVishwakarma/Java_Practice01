/*Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. 
The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:
Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. 
The remaining elements of nums are not important as well as the size of nums.
Return k.
Custom Judge:
The judge will test your solution with the following code:
int[] nums = [...]; // Input array
int[] expectedNums = [...]; // The expected answer with correct length
int k = removeDuplicates(nums); // Calls your implementation.
assert k == expectedNums.length;
for (int i = 0; i < k; i++) {
    assert nums[i] == expectedNums[i];
}
If all assertions pass, then your solution will be accepted.
Example 1:

Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
Example 2:

Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).*/
public class RemovingDuplicatesInSortedArray {
    public static int removeDuplicates(int[] nums){
        if (nums.length == 0){
            return 0;       
        }

        int uniquepos = 0;//reference variables for storing positions and indices 

        for (int i = 1; i < nums.length; i++) {
            
            if (nums[i] != nums[uniquepos]) {
                
                uniquepos++;
                nums[uniquepos] = nums[i];
            }
        }

        return uniquepos + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] nums = new int[size];

        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        int n = removeDuplicates(nums);

        for (int i = 0; i < n; i++) {
            System.out.println(nums[i] + " ");
            
        }

    }
    
}

//import java.util.Scanner;

//class Solution {
    public static int removeElement(int[] nums, int val) {
        if (nums.length == 0){
            return 0;
        }
        int count = 0;
        
        //count the no. of elements taht are not equal to val
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count] = nums[i];
                count++;
            }
        }

        // //create a new array of the appropriate size
        // int[]  result = new int[count];
        // int index = 0;

        // //copy over the elements that are not equal to val
        // for (int num : nums) {
        //     if (num != val) {
        //         result[index++] = num;
        //     }
        // }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];

        for(int i = 0; i < nums.length;i++){
            nums[i] = sc.nextInt();
        }

        int val = sc.nextInt();

        int length = removeElement(nums, val);

        for (int i = 0; i < length; i++) {
            System.out.println(nums[i] + " ");
        }
    }
}


