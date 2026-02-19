import java.util.*;
/*An automobile company produces two types of vehicles: Two-Wheelers (TW) and Four-Wheelers (FW). You are given the total number of 
vehicles (V) and the total number of wheels (W). Write a program to find the number of TW and FW. 
Input: V = 200, W = 540 Output: TW = 130, FW = 70Edge Case: If W < 2, W is odd, or W \leq V, print "INVALID INPUT".*/
public class twoWheelersOrFourWheelers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int w = sc.nextInt();

        if(w <0 || w >= v){
            System.out.println("Invalid Input!");
        }

    }
    
}
