class Solution {
    public int findPeakElement(int[] nums) {
        int l = 0;
        int r = nums.length - 1;

        while (r > l) {
            int mid = l + (r - l) / 2;

            if (nums[mid] < nums[mid + 1]) {
                l = mid + 1;
            }

            if (nums[mid] > nums[mid + 1]) {
                r = mid;
            }
        }
        return l;
    }
}
