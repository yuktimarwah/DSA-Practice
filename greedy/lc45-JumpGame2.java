class Solution {
    public int jump(int[] nums) {

        if (nums.length == 1) {
            return 0;
        }

        int minJumps = 0;
        int maxReach = 0;
        int currEnd = 0;

        for (int i = 0; i < nums.length; i++) {

            maxReach = Math.max(maxReach, i + nums[i]);

            if (i == currEnd) {
                minJumps++;
                currEnd = maxReach;
            }

            if (currEnd >= nums.length - 1) {
                return minJumps;
            }
        }

        return minJumps;
    }
}
