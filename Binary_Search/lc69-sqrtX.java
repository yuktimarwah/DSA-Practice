class Solution {
    public int mySqrt(int x) {
        int l = 0;
        int r = x;
        int ans = 0;

        while (r >= l) {
            int mid = l + (r - l) / 2;

            if ((long) mid*mid == x) {
                return mid;
            }
            if ((long) mid*mid > x) {
                r = mid - 1;
            }
            else {
                ans = mid;
                l = mid + 1;
            }
        }
        return ans;
    }
}
