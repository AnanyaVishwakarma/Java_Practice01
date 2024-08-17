import java.util.*;

class Palindrome {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x = in.nextInt();

        boolean ans = isPalindrome(x);
        System.out.println(ans);
    }

    static boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }

          Stack<Integer> stack = new Stack<>();
        int original = x;
        
        // Push digits of the number onto the stack
        while (x > 0) {
            stack.push(x % 10);
            x /= 10;
        }
        
        x = original;
        
        // Compare the digits by popping from the stack
        while (x > 0) {
            if (x % 10 != stack.pop()) {
                return false;
            }
            x /= 10;
        }
       return true;

    }
}