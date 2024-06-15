
import java.util.Scanner;

class ZigZag_conversion {
    public String convert(String s, int numRows) {
        String[] ans = new String[numRows];

        for (int i = 0; i < ans.length; i++) {
            ans[i] = "";
        }
        int i = 0;
        while (i < s.length()) {
            for (int j = 0; j < numRows && i < s.length(); j++) {
                ans[j] += s.charAt(i++);
            }
            for(int index = numRows - 2; index > 0 && i < s.length(); index--){
                ans[index] +=s.charAt(i++);

            }
        }
        String res = "";
        for(String str : ans){
            res+=str;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    }
}