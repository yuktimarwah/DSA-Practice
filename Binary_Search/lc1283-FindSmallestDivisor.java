class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int l = 1;
        int r = 0;
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > r) {
                r = nums[i];
            }
        }

        while (r >= l) {
            int mid = l + (r - l) / 2;

            int sum = 0;
            for (int i = 0; i < nums.length; i++) {
                sum += (nums[i] + mid - 1) / mid;
            }

            if (sum <= threshold) {
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
