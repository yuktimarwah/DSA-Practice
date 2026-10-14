class Solution {
    public int largestCombination(int[] candidates) {
        int maxCount = 0;

        for (int i = 0; i < 32; i++) {
            int count = 0;

            for (int j = 0; j < candidates.length; j++) {
                if (((candidates[j] >> i) & 1) != 0) {
                    count++;
                }
            }

            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }
}
