/*Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.

You must not use any built-in exponent function or operator.

For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
 

Example 1:

Input: x = 4
Output: 2
Explanation: The square root of 4 is 2, so we return 2.
Example 2:

Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned. */

public class squarerootOfX {

    public static int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }

        int low = 0;
        int high = x;

        int result = 0;
        while (low < high ){
            int mid = low + (high - low)/2;
            if( mid*mid == x){
                return mid;
            }
         if(mid*mid) > x{
          low = mid
        }

    }
    public static void main(String[] args) {
        int x = 4;
        System.out.println(mySqrt(x));
        int y = 8;
        System.out.println(mySqrt(y));
    }
}
