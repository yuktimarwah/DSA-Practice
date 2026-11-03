class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int retainCount = 1;
        int n = intervals.length;

        Arrays.sort(intervals,(a, b) -> Integer.compare(a[1], b[1]));

        int lastFinish = intervals[0][1];

        for (int i = 1; i < n; i++) {

            if (intervals[i][0] >= lastFinish) {

                retainCount++;
                lastFinish = intervals[i][1];
            }
        }
        return n - retainCount;
    }
}
