import java.util.*;
/*2. The "Mixed Series" (Pattern Logic)
Question: Find the N 
th
  term of the series: 0,0,7,6,14,12,21,18,28,24,…
Input: N=10
Output: 24
The Thinking:
This is two series mashed together.
Odd terms (1,3,5…): Multiples of 7 (0,7,14,21…) → Formula: 7×(position−1)
Even terms (2,4,6…): Multiples of 6 (0,6,12,18…) → Formula: 6×(position−1)
Code Plan: if (n % 2 != 0) { a = (n-1)/2; print(7 * a); } else { a = (n/2)-1; print(6 * a); }
3. The "Trailing Zeros" (Optimization Logic)
Question: Given an integer N, calculate the number of trailing zeros in N! (N factorial).
Input: N=100
Output: 24
The Thinking:
Do not calculate the factorial. It will overflow even a long long variable.
Logic: A trailing zero is created by 2×5. In any factorial, there are plenty of 2s, so we just need to count the factors of 5.
The Loop: Divide N by 5, then by 25, then by 125, and add the quotients. */
class trailingZeros {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0; 
    }
}