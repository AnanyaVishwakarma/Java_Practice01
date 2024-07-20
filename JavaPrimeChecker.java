/*You are given a class Solution and its main method in the editor. Your task is to create a class Prime. 
The class Prime should contain a single method checkPrime.

The locked code in the editor will call the checkPrime method with one or more integer arguments. 
You should write the checkPrime method in such a way that the code prints only the prime numbers.

Please read the code given in the editor carefully. Also please do not use method overloading!

Note: You may get a compile time error in this problem due to the statement below:

BufferedReader br=new BufferedReader(new InputStreamReader(in));
This was added intentionally, and you have to figure out a way to get rid of the error.

Input Format

There are only five lines of input, each containing one integer.

Output Format

There will be only four lines of output. Each line contains only prime numbers depending upon the 
parameters passed to checkPrime in the main method of the class Solution. In case there is no prime number, 
then a blank line should be printed. */

import java.io.*;
import java.io.IOException;
import java.util.*;

public class JavaPrimeChecker {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(br.readLine());
            }
            Prime p = new Prime();
            for (int i = 0; i < n; i++) {
                p.checkPrime(arr[i]);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}

/**
 * InnerJavaPrimeChecker
 */
class Prime {
    public int checkPrime(int num) {
        if (num <= 1)
            return 0;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0)
                return 0;
        }
        return num;

    }

}
