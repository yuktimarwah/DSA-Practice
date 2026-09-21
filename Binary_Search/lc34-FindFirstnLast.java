class Solution {
    public int first(int l, int r, int[] nums, int target) {

        int ans = -1;
        while ( r >= l) {
            int mid = l + (r - l) / 2;

            if (nums[mid] == target) {
                ans = mid;
                r = mid - 1;
            }
            else if (nums[mid] < target) {
                l = mid + 1;
            }
            else {
                r = mid - 1;
            }
        }
        return ans;
    }

    public int last(int l, int r, int[] nums, int target) {

        int ans = -1;
        while ( r >= l) {
            int mid = l + (r - l) / 2;

            if (nums[mid] == target) {
                ans = mid;
                l = mid + 1;
            }
            else if (nums[mid] < target) {
                l = mid + 1;
            }
            else {
                r = mid - 1;
            }
        }
        return ans;
    }


    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        int l = 0;
        int r = nums.length - 1;

        res[0] = first(l, r, nums, target);
        res[1] = last(l, r, nums, target);

        return res;
    }
}
