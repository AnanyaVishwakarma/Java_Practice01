public class reverseAnArray {
    public static void arrayReverse(int[] arr, int start,int end){
            while (start < end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
    }
    public static void printArray(int[] nums){
        for (int num: nums){
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        
        // Print original array
        System.out.print("Original array: ");
        reverseAnArray.printArray(numbers);
        
        // Reverse the array
        reverseAnArray.arrayReverse(numbers, 0, numbers.length - 1);
        
        // Print reversed array
        System.out.print("Reversed array: ");
        reverseAnArray.printArray(numbers);
    }
}