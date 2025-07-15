/*Given a valid (IPv4) IP address, return a defanged version of that IP address.
A defanged IP address replaces every period "." with "[.]".
Example 1:
Input: address = "1.1.1.1"
Output: "1[.]1[.]1[.]1"
Example 2:
Input: address = "255.100.50.0"
Output: "255[.]100[.]50[.]0"
Constraints:
The given address is a valid IPv4 address. */
public class defangingAnIPAddress {
    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder(); 
        char[] charry = address.toCharArray(); 

        for(char ch : charry){
            if(ch == '.'){
                sb.append("[.]");
            } else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }        
    public static void main(String[] args) {
        defangingAnIPAddress obj = new defangingAnIPAddress();        
        String address = "1.1.1.1";
    }
}
