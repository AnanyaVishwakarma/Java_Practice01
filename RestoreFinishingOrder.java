/*You are given an integer array order of length n and an integer array friends.
order contains every integer from 1 to n exactly once, representing the IDs of the participants of a race in their finishing order.
friends contains the IDs of your friends in the race sorted in strictly increasing order. Each ID in friends is guaranteed to appear in the order array.
Return an array containing your friends' IDs in their finishing order.
Example 1:
Input: order = [3,1,2,5,4], friends = [1,3,4]
Output: [3,1,4]
Explanation:
The finishing order is [3, 1, 2, 5, 4]. Therefore, the finishing order of your friends is [3, 1, 4].
Example 2:
Input: order = [1,4,5,3,2], friends = [2,5]
Output: [5,2]
Explanation:
The finishing order is [1, 4, 5, 3, 2]. Therefore, the finishing order of your friends is [5, 2].
Constraints:
1 <= n == order.length <= 100
order contains every integer from 1 to n exactly once
1 <= friends.length <= min(8, n)
1 <= friends[i] <= n
friends is strictly increasing */
public class RestoreFinishingOrder {
    public int[] recoverOrder(int[] order, int[] friends) {
       /*int[] friends: This declares an array of primitive int values.
Arrays.asList(friends): When you pass a primitive array to Arrays.asList(),*/
        //Set<Integer> set = new HashSet<>(Arrays.asList(friends));
       Set<Integer> set = Arrays.stream(friends).boxed().collect(Collectors.toSet());       
        for(int i = 0; i < order.length; i++){
            if(set.contains(order[i])){
                result.add(order[i]);
            }
        }
        int[] resultList = result.stream().mapToInt(Integer::intValue).toArray();      
        return resultList;
    }   
    public static void main(String[] args) {
        
    }    
}













