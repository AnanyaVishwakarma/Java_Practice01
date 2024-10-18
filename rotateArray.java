public class rotateArray {
    public void rotate(int[] nums, int k) {
        int n = nums.length;

        int[] temp = new int[k];
        
        for(int i = 0; i < n; i++){
            temp[i] = nums[n - k + i];
        }

        for ( int i = n-1; i >= k; i--){
            nums[i] = nums [i -k];
        }        
        
    }
}
