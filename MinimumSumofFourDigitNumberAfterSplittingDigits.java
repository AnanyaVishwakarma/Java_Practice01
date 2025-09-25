/*You are given a positive integer num consisting of exactly four digits. Split num into two new integers new1 and new2 by using the digits found in num.
Leading zeros are allowed in new1 and new2, and all the digits found in num must be used.
For example, given num = 2932, you have the following digits: two 2's, one 9 and one 3. Some of the possible pairs [new1, new2] are [22, 93], [23, 92], [223, 9] and [2, 329].
Return the minimum possible sum of new1 and new2.
Example 1:
Input: num = 2932
Output: 52
Explanation: Some possible pairs [new1, new2] are [29, 23], [223, 9], etc.
The minimum sum can be obtained by the pair [29, 23]: 29 + 23 = 52.
Example 2:
Input: num = 4009
Output: 13
Explanation: Some possible pairs [new1, new2] are [0, 49], [490, 0], etc. 
The minimum sum can be obtained by the pair [4, 9]: 4 + 9 = 13.
Constraints:
1000 <= num <= 9999*/
public class MinimumSumofFourDigitNumberAfterSplittingDigits {
    public int minimumSum(int num) {
        //BRUTE FORCE METHOD
// if(num < 1000 || num > 9999){
        //     return 0;
        // }

        // int new1 = num/100;
        // int new2 = num%100;

        // String strNum1 = String.valueOf(new1);
        // String strNum2 = String.valueOf(new2);

        // char[] firstPair = strNum1.toCharArray();
        // char[] secondPair = strNum2.toCharArray();
        
        // Arrays.sort(firstPair);
        // Arrays.sort(secondPair);
        // String sortedNum1 = new String(firstPair);
        // String sortedNum2 = new String(secondPair);
        
        // int sortedNew1 = Integer.parseInt(sortedNum1);
        // int sortedNew2 = Integer.parseInt(sortedNum2);
        
        // return sortedNew1 + sortedNew2;        

        //OPTIMAL SOLUTION
        int[] digit = new int[4];
        for(int i = 0; i< 4; i++){
            digits[i] = num % 2;
            num /= 10;
        }
        Arrays.sort(digits);
        
 }    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MinimumSumofFourDigitNumberAfterSplittingDigits obj = new MinimumSumofFourDigitNumberAfterSplittingDigits();
        int num = sc.nextInt();
        System.out.println(obj.minimumSum(num));
    }        
}

























