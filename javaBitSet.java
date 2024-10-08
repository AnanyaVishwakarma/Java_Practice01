/*Java's BitSet class implements a vector of bit values (i.e.: false(0) or true(1)) that grows as needed, allowing us to easily manipulate 
bits while optimizing space (when compared to other collections). Any element having a bit value of 1 is called a set bit.

Given 2 BitSets, B1 and B2, of size N where all bits in both BitSets are initialized to 0, perform a series of M operations. After each 
operation, print the number of set bits in the respective BitSets as two space-separated integers on a new line.

Input Format

The first line contains 2 space-separated integers, N (the length of both BitSets B1 and B2) and M(the number of operations to perform), respectively.
The  subsequent lines each contain an operation in one of the following forms:

AND <set><set>
OR  <set><set>
XOR <set><set>
FLIP <set><index>
SET <set><index>
In the list above, <set> is the integer 1 or 2, where 1 denotes B1 and 2 denotes B2.
<index> is an integer denoting a bit's index in the BitSet corresponding to <set>.

For the binary operations AND, OR, and XOR, operands are read from left to right and the BitSet resulting from the operation replaces 
the contents of the first operand. For example:

AND 2 1
B2 is the left operand, and B1 is the right operand. This operation should assign the result of B2^B1 to B2.

Output Format

After each operation, print the respective number of set bits in BitSet B1 and BitSet B2 as 2 space-separated integers on a new line. */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class javaBitSet {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);
        for (int i = 0; i < m; i++) {
            String opn = sc.next();
            switch (opn) {
                case "AND":
                    int set1 = sc.nextInt();
                    int set2 = sc.nextInt();
                    if (set1 == 1) {
                        b1.and(set2 == 1 ? b1 : b2);
                    } else {
                        b2.and(set2 == 1 ? b1 : b2);
                    }
                    break;
                case "OR":
                    set1 = sc.nextInt();
                    set2 = sc.nextInt();
                    if (set1 == 1) {
                        b1.or(set2 == 1 ? b1 : b2);
                    } else {
                        b2.or(set2 == 1 ? b1 : b2);
                    }
                    break;
                case "XOR":
                    set1 = sc.nextInt();
                    set2 = sc.nextInt();
                    if (set1 == 1) {
                        b1.xor(set2 == 1 ? b1 : b2);
                    } else {
                        b2.xor(set2 == 1 ? b1 : b2);
                    }
                    break;
                case "FLIP":
                    set1 = sc.nextInt();
                    int index = sc.nextInt();
                    if (set1 == 1) {
                        b1.flip(index);
                    } else {
                        b2.flip(index);
                    }
                    break;
                case "SET":
                    set1 = sc.nextInt();
                    int index1 = sc.nextInt();
                    if (set1 == 1) {
                        b1.set(index1);
                    } else {
                        b2.set(index1);
                    }
                    break;
            }
            System.err.println(b1.cardinality() + " " + b2.cardinality());
        }

    }
}
