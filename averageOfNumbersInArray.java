/*The goal is to calculate the average of the numbers in an array.

Definition of Average:

Average=   Number of Elements/Sum of All Elements
​
For example, if the array is {10, 20, 30, 40, 50}, the sum is:

10+20+30+40+50=150
The number of elements is 5, so:

Average=150/5 = 30 */
public class averageOfNumbersInArray {
    public double avgOfElements (int[] nums){
        int n = nums.length;
        int sum = 0;
        for (int i = 0; i < n; i++ ){
            sum += nums[i];
        }
        return (double) sum/n;
    }
}
 class TestAverage {
    public static void main(String[] args) {
        averageOfNumbersInArray avgCalc = new averageOfNumbersInArray();
        int[] nums = {5, 10, 15, 20}; // Example input
        double average = avgCalc.avgOfElements(nums);
        System.out.println("The average is: " + average);
    }
}
