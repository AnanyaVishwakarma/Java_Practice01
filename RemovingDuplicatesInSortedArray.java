package DSA_array;
import java.util.*;

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


