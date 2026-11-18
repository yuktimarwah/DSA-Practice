class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            set.add(nums[i]);

        }
        int maxCount = 0;


        for (int num : set) {

            int count = 0;

            if (!set.contains(num - 1)) {

                int start = num;


                while (set.contains(start)) {

                    count++;
                    start++;

                }
            }
            

            maxCount = Math.max(count, maxCount);

        }

        return maxCount;
    }
}
