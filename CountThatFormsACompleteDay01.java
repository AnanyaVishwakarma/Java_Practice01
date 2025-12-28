/*Given an integer array hours representing times in hours, return an integer denoting the number of pairs i, j where i < j and hours[i] + hours[j] forms a complete day.
A complete day is defined as a time duration that is an exact multiple of 24 hours.
For example, 1 day is 24 hours, 2 days is 48 hours, 3 days is 72 hours, and so on.
Example 1:
Input: hours = [12,12,30,24,24]
Output: 2
Explanation:
The pairs of indices that form a complete day are (0, 1) and (3, 4).
Example 2:
Input: hours = [72,48,24,3]
Output: 3
Explanation:
The pairs of indices that form a complete day are (0, 1), (0, 2), and (1, 2). */
public class CountThatFormsACompleteDay01 {
    public int countCompleteDayPairs(int[] hours) {
        int count = 0;
        for (int i = 0; i < hours.length; i++) {
            for (int j = i + 1; j < hours.length; j++) {
                if ((hours[i] + hours[j]) % 24 == 0){
                    count++;
                }
                }
        }
        return count;
    }
}
//USING HASHMAP  
/*import java.util.HashMap;

public class Main {
    public static int countCompleteDays(int[] hours) {
        HashMap<Integer, Integer> remainderMap = new HashMap<>();
        int count = 0;

        for (int time : hours) {
            int rem = time % 24;
            int complement = (24 - rem) % 24;  // Calculate the complement remainder

            // Check if the complement exists in the HashMap
            if (remainderMap.containsKey(complement)) {
                count += remainderMap.get(complement);  // Add the frequency of complement
            }

            // Update the frequency of the current remainder
            remainderMap.put(rem, remainderMap.getOrDefault(rem, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] hours1 = {12, 12, 30, 24, 24};
        System.out.println(countCompleteDays(hours1));  // Output: 2

        int[] hours2 = {72, 48, 24, 3};
        System.out.println(countCompleteDays(hours2));  // Output: 3
    }
}
 */
