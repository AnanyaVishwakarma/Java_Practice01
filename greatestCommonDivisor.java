public class greatestCommonDivisor {
    public int checkGCD(int a, int b){        
        if(b == 0){
            return a;
        }
        return checkGCD(int a, int b);
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

       greatestCommonDivisor obj = new greatestCommonDivisor();
        System.err.println(obj.checkGCD(a, b));
         
    }
}






