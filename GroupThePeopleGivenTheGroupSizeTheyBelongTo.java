/*There are n people that are split into some unknown number of groups. Each person is labeled with a unique ID from 0 to n - 1.
You are given an integer array groupSizes, where groupSizes[i] is the size of the group that person i is in. For example, if groupSizes[1] = 3, then person 1 must be in a group of size 3.
Return a list of groups such that each person i is in a group of size groupSizes[i].
Each person should appear in exactly one group, and every person must be in a group. If there are multiple answers, return any of them. 
It is guaranteed that there will be at least one valid solution for the given input.
Example 1:
Input: groupSizes = [3,3,3,3,3,1,3]
Output: [[5],[0,1,2],[3,4,6]]
Explanation: 
The first group is [5]. The size is 1, and groupSizes[5] = 1.
The second group is [0,1,2]. The size is 3, and groupSizes[0] = groupSizes[1] = groupSizes[2] = 3.
The third group is [3,4,6]. The size is 3, and groupSizes[3] = groupSizes[4] = groupSizes[6] = 3.
Other possible solutions are [[2,1,6],[5],[0,4,3]] and [[5],[0,6,2],[4,3,1]].
Example 2:
Input: groupSizes = [2,1,3,3,3,2]
Output: [[1],[0,5],[2,3,4]]
Constraints:
groupSizes.length == n
1 <= n <= 500
1 <= groupSizes[i] <= n */
import java.util.ArrayList;
import java.util.*;

public class GroupThePeopleGivenTheGroupSizeTheyBelongTo {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer, List<Integer>> buckets = new HashMap<>();
        List<List<Integer>> result = new ArrayList<>();
        //Walk through people i = 0..n-1.
        for(int person = 0; person < groupSizes.length(); person++){
        //For each person i, look at sz = groupSizes[i].
        int sz = groupSizes[person];

            List<Integer> bucket = buckets.get(sz);
            if(bucket ==null){
               bucket - new ArrayList<>();
                buckets.put(sz, bucket);
            }
            bucket.add(person);
            if(bucket.size() == sz){
                result.add(new ArrayList<>(bucket));
                buckets.put(sz, new ArrayList<>());
            }
        }
        return result;
    }    
    public static void main (String[] args){
        Scanner sc = new Scanner System.in);
        GroupThePeopleGivenTheGroupSizeTheyBelongTo obj = new GroupThePeopleGivenTheGroupSizeTheyBelongTo();
        int n = sc.nextInt();
        int[] groupSizes = new int[n];
        for(int i = 0; i < n; i++){
            groupSizes[i] = sc.nextInt;
        }
        System.out.println(obj.groupThePeople(groupSizes));
        
    }
}






























