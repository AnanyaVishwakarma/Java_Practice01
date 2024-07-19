/*Java's BigDecimal class can handle arbitrary-precision signed decimal numbers. Let's test your knowledge of them!

Given an array,s ,n of  real number strings, sort them in descending order — but wait, 
there's more! Each number must be printed in the exact same format as it was read from stdin, 
meaning that .1 is printed as .1, and 0.1 is printed as 0.1. If two numbers represent numerically equivalent values (e.g.,.1 = 0.1 ), 
then they must be listed in the same order as they were received as input).

Complete the code in the unlocked section of the editor below. You must rearrange array 's 
elements according to the instructions above.

Input Format

The first line consists of a single integer, , denoting the number of integer strings.
Each line  of the  subsequent lines contains a real number denoting the value of .

Constraints
1 <= n <= 200
Each si has at most 300 digits.
Output Format

Locked stub code in the editor will print the contents of array  to stdout. 
You are only responsible for reordering the array's elements. */
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.*;

    class JavaBigDecimal{
        public static void main(String []args){
            //Input
            Scanner sc= new Scanner(System.in);
            int n=sc.nextInt();
            String []s=new String[n+2];
            for(int i=0;i<n;i++){
                s[i]=sc.next();
            }
            sc.close();
           Comparator<String> customComparator = new Comparator<String> (){
                @Override
                public int compare(String str1, String str2){
                    BigDecimal num1 = new BigDecimal(str1);
                    BigDecimal num2 = new BigDecimal(str2);
                    return num2.compareTo(num1);
                }
            };
            Arrays.sort(s, 0, n, customComparator);
            //Output
            for(int i=0;i<n;i++)
            {
                System.out.println(s[i]);
            }
        }
    }

