/*"A string is traditionally a sequence of characters, either as a literal constant or as some kind of variable." 
— Wikipedia: String (computer science)

This exercise is to test your understanding of Java Strings. A sample String declaration:

String myString = "Hello World!"
The elements of a String are called characters. The number of characters in a String is called the length, and it can be retrieved with the String.length() method.

Given two strings of lowercase English letters, A  and B,  perform the following operations:

Sum the lengths of A and B.
Determine if A is lexicographically larger than B (i.e.: does  come before  in the dictionary?).
Capitalize the first letter in A and B and print them on a single line, separated by a space.
Input Format

The first line contains a string . The second line contains another string . The strings are comprised of only lowercase English letters.

Output Format

There are three lines of output:
For the first line, sum the lengths of  and .
For the second line, write Yes if  is lexicographically greater than  otherwise print No instead.
For the third line, capitalize the first letter in both  and  and print them on a single line, separated by a space */

import java.io.*;
import java.util.*;

public class JavaStrinfIntroduction {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String A = scan.next();
        String B = scan.next();
        int a = A.length();
        int b = B.length();
        int sum = a + b;

        System.out.println(sum);
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
            } else {
                System.out.println("No");
                }
                String c = A.substring(0, 1).toUpperCase() + A.substring(1);
                String d = B.substring(0, 1).toUpperCase() + B.substring(1);
                System.out.println(c + " " + d);

    }

}
