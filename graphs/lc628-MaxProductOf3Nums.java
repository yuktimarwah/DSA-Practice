class Solution {
    public int maximumProduct(int[] nums) {
        int n = nums.length;
        
        Arrays.sort(nums);
        int o1 =  nums[n-1]*nums[n-2]*nums[n-3];
        int o2 = nums[0]*nums[1]*nums[n-1];
        return Math.max(o1,o2);
    }
}
