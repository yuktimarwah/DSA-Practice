class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        int n = nums.length;
        int slow = 0;
        int fast = 1;

        while (fast != n) {
            if (nums[slow] != nums[fast]) {
                count++;
                slow++;
                nums[slow] = nums[fast];
            }
            fast++;
        }

        return count + 1;
    }
}
