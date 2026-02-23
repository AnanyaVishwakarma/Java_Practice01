import java.util.Scanner;

public class sumOfIntegers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[] integers = new int[k];
        int sum = 0;

        for(int i = 0; i < k; i++){
            integers[i] = sc.nextInt();
        }
        if(k < 2){
            System.out.println("Invalid input");
        }
    }
}
