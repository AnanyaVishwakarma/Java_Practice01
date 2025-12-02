/*You are given an integer array orchard, where orchard[i] is the fruit type on the i-th tree.
You have two baskets, each holding unlimited fruit of a single type.
You may start at any index and must pick one fruit from each consecutive tree to the right, stopping when a tree produces a fruit that doesn’t fit the two types you’re carrying.
Return the maximum number of fruits you can pick.(ananya)*/
public class PickingFruit {
        public int maxFruit(int[] orchards){
                if(orchards == null || orchards == 0){
                return 0;
                }
        }
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] orchards = new int[n];
        for(int i = 0; i < n; i++){
            orchards[i] = sc.nextInt();
        }
                
}      
}







