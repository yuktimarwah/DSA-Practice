class Solution {
    public ArrayList<Integer> minMaxCandy(int[] prices, int k) {
        // code here
        Arrays.sort(prices);
        int size = prices.length;
        
        int min = 0;
        int max = 0;
        
        int buy = (size+k) / (k+1);
        for ( int i = 0; i < buy; i++) {
            min = min+prices[i];
        }
        
        for (int j = (size-1); j >= size-buy; j--) {
            max = max+prices[j];
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(min);
        ans.add(max);
        return ans; 
        }
}

