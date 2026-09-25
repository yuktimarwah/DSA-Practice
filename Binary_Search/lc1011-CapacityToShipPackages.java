class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l = 0;
        int r = 0;

        for (int i = 0; i < weights.length; i++) {
            if (l < weights[i]) {
                l = weights[i];
            }
            r += weights[i];
        }

        int ans = r;

        while (r >= l) {
            int mid = l + (r - l) / 2;

            int d = 1;
            int currWgt = 0;
            for (int i = 0; i < weights.length; i++) {

                currWgt += weights[i];

                if (currWgt > mid) {
                    d++;
                    currWgt = weights[i];
                }
            }


            if (d <= days) {
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
