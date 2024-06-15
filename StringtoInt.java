import java.util.*;

class StringtoInt {
    public int myAtoi(String s) {
         if (s == null || s.length() == 0) {
            return 0;
        }

        int index = 0, sign = 1;
        long result = 0;

        while (index < s.length() && s.charAt(index) == ' '){
            index++;
        }

        if(index == s.length()){
            return 0;
        }

        if(s.charAt(index)=='-'){
            sign = -1;
            index++;
        }else if(s.charAt(index) == '+'){
            index++;
        }
        

        while(index < s.length() && Character.isDigit(s.charAt(index))) {
            result = result * 10 + (s.charAt(index) - '0');

            if (sign == 1 && result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (sign == -1 && -result < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            index++;
        }

        result *= sign;

            return (int) result;
        }

}