public class oddStringDifference {
    private static int[] differentiate(String word){
        int n = word.length();
        int[] difference = new int[n - 1];
        
        for (int i = 0; i < n -1; i++){
            difference[i] = word.charAt(i - 1) - word.charAt(i);
        }
        return  difference;
    }
    public String oddString(String[] words) {

    }
}    
