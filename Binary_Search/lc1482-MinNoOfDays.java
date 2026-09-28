class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;

        int ans = 0;

        int l = Integer.MAX_VALUE;
        int r = 0;

        for (int i = 0; i < bloomDay.length; i++) {
            if (bloomDay[i] > r) {
                r = bloomDay[i];
            }
            if (bloomDay[i] < l) {
                l = bloomDay[i];
            }
        }

        if ((long)m * k > n) return -1;
        
        while ( r >= l) {
            int mid = l + (r - l) / 2;

            int consecutive = 0;
            int bouquets = 0;

            for (int i = 0; i < n; i++) {
                if (bloomDay[i] <= mid) {
                    consecutive++;
                    if (consecutive == k) {
                        bouquets++;
                        consecutive = 0;
                    }
                }
                else {
                    consecutive = 0;
                }
            }

            if (bouquets >= m) {
                ans = mid;
                r = mid - 1;
            }
            else {
                l = mid + 1;
            }
        }
        return ans;
    }
}
