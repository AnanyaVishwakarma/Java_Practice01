/*Algorithm
fill the '5l' bucket to the top
transfer the '5l' to '3l' bucket
//you have 2litres left in '5l' bucket//
transfer the 2litres left in '5l' bucket
repeat first and second step
transfer the initial saved 2 litres into current 2litres
*/
public class fourLitresWaters {
    public static void main(String[] args) {
        int bucket1 = 5; 
        int bucket2 = 3;
        int temp;

        temp = bucket1 - bucket2;
        bucket1 = bucket1 - bucket2;
        bucket1 = bucket1 + temp;
        System.out.println(bucket1);

    }

    
}