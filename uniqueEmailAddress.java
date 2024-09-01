/*Every valid email consists of a local name and a domain name, separated by the '@' sign.
 Besides lowercase letters, the email may contain one or more '.' or '+'.

For example, in "alice@leetcode.com", "alice" is the local name, and "leetcode.com" is the domain name.
If you add periods '.' between some characters in the local name part of an email address, mail sent 
there will be forwarded to the same address without dots in the local name. Note that this rule does not apply to domain names.

For example, "alice.z@leetcode.com" and "alicez@leetcode.com" forward to the same email address.
If you add a plus '+' in the local name, everything after the first plus sign will be ignored. This allows 
certain emails to be filtered. Note that this rule does not apply to domain names.

For example, "m.y+name@email.com" will be forwarded to "my@email.com".
It is possible to use both of these rules at the same time.

Given an array of strings emails where we send one email to each emails[i], return the number of different 
addresses that actually receive mails.

 

Example 1:

Input: emails = ["test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"]
Output: 2
Explanation: "testemail@leetcode.com" and "testemail@lee.tcode.com" actually receive mails.
Example 2:

Input: emails = ["a@leetcode.com","b@leetcode.com","c@leetcode.com"]
Output: 3 */

import java.util.HashSet;

public class uniqueEmailAddress {
    public int numUniqueEmails(String[] emails) {
        //hashset to store unique email address
        HashSet<String> uniqueEmail = new HashSet<>();
        //iterating over each email in the emails[] 
        for (String unEmailString : emails) {
            //splitting the email address into two parts: the local name and the domail nameusing the '@' character as the separator
            String[] unEmail = unEmailString.split("@");
            //this line will apply the constraints to the local name : 'split("\\+")' we take the first'[0]' to ignore everything after the first '+'.
            String local = unEmail[0].split("\\+")[0].replace(".", "");
            //this line assighns th domain name to a variable
            String domain = unEmail[1];
            //this line will add the email address to the hashset
            uniqueEmail.add(local + "@" + domain);
        }
        //returns the size of the hashset
        return uniqueEmail.size();
    }    
}
