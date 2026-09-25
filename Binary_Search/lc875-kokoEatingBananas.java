class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = 0;
        for (int i = 0; i < piles.length; i++) {
            if (piles[i] > r) {
                r = piles[i];
            }
        }

        int ans = r;

        while (r >= l) {
            int mid = l + (r - l) / 2;

            long hr = 0;
            for (int i = 0; i < piles.length; i++) {
                hr += (piles[i] + mid - 1)/mid;
            }

            if (hr <= h) {
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
