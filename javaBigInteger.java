/*In this problem, you have to add and multiply huge numbers! These numbers are so big that you can't 
contain them in any ordinary data types like a long integer.

Use the power of Java's BigInteger class and solve this problem.

Input Format

There will be two lines containing two numbers, a and b.

Constraints

a and b are non-negative integers and can have maximum 200 digits.

Output Format

Output two lines. The first line should contain a + b, and the second line should contain a * b. 
Don't print any leading zeros.

Sample Input

1234
20
Sample Output

1254
24680 */






import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class javaBigInteger {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        BigInteger a = scan.nextBigInteger();
        BigInteger b = scan.nextBigInteger();


        Comparator<Integer> cucstomComparator = new Comparator<Integer>() {
            @Override
            public int compare (Integer int1, Integer int2) {

                if (int1 <= 0 && int2 <= 0) {
                    return 0;
                }
                BigInteger a = BigInteger.valueOf(int1);
                BigInteger b = BigInteger.valueOf(int2);
                return a.compareTo(b);
        }  
      };
      System.out.println(a.add(b));
      System.out.println(a.multiply(b));
    }
}
