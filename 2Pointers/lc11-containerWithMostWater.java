class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int l = 0;
        int r = n - 1;

        int maxArea = 0;

        while (r > l) {
            int width = r - l;
            int Area = width * Math.min(height[l], height[r]);
            maxArea = Math.max(maxArea, Area);
            
            if (height[l] < height[r]) {
                l++;
            }
            else {
                r--;
            }
        }
        return maxArea;
    }
}
