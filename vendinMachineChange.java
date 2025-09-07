/*Problem: Given a list of available coin/note denominations (e.g., [1, 2, 5, 10, 50, 100]) and a target amount, 
find the minimum number of coins/notes required to make the change.

Logic: This is a classic greedy algorithm. Start with the largest denomination. 
Find how many of that denomination you can use without exceeding the amount. Subtract the value, 
and move to the next smaller denomination. Repeat until the amount is zero.

What it tests: Greedy approach, logical thinking. */
public class vendinMachineChange {
    public int checkForChange(int target){
        int[] notes = {1, 2, 5, 10, 20, 50, 100};

        int count = 0;
        int sumTotal = 0;
        for(int i = 0; i<notes.length; i++){
            if(notes[i] <= target){}
        }
    }
    
}








