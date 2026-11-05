class Solution {
    public int findLongestChain(int[][] pairs) {
        
        int len = 1;

        int n = pairs.length;

        Arrays.sort(pairs, (a, b) -> Integer.compare(a[1], b[1]));

        int lastEnd = pairs[0][1];

        for (int i = 1; i < n; i++) {
        
            if (pairs[i][0] > lastEnd) {

                len++;
                lastEnd = pairs[i][1];

            }
        }

        return len;
    }
}
