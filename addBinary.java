/*Given two binary strings a and b, return their sum as a binary string.
Example 1:
Input: a = "11", b = "1"
Output: "100"
Example 2:
Input: a = "1010", b = "1011"
Output: "10101"
 */
public class addBinary {
    public String addBinary(String a, String b) {        
       BigInteger num1 = new BigInteger(a, 2);
        BigInteger num2 = new BigInteger(b, 2);
        BigInteger sum = num1.add(num2);
        

        return sum.toString(2);
    }    
    pubic static void main (String[] args){
        addBinary ab = new addBinary();
        System.out.println(ab.addBinary("11", "1"));
        System.out.println(ab.addBinary("1010", "1011"));
    }
}
