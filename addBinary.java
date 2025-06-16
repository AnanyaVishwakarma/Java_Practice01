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
        int num1 = Integer.parseInt(a, 2);
        int num2 = Integer.parseInt(b, 2);

        int sum = num1 + num2;

        return Integer.toBinaryString(sum);
    }    
    pubic static void main (String[] args){
        addBinary ab = new addBinary();
        System.out.println(ab.addBinary("11", "1"));
    }
}
