class Solution {
    public int candy(int[] ratings) {
        
        int n = ratings.length;
        int candies = 0;

        int[] candy = new int[n];

        Arrays.fill(candy, 1);

        for (int i = 1; i < n; i++) {
            
            if (ratings[i] > ratings[i - 1]) {
                
                candy[i] = candy[i - 1] + 1;

            }
        }

        for (int j = n - 2; j >= 0; j--) {

            if (ratings[j] > ratings[j + 1]) {

                candy[j] = Math.max(candy[j], candy[j + 1] + 1);
            }
        }

        for (int i = 0; i < n; i++) {
            
            candies += candy[i];

        }

        return candies;
    }
}
