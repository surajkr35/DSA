class Solution {
    public long countIntersectingIntervals(int[][] intervals) {
        int n = intervals.length;
        long count = 0;

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        for(int i = 0; i < n; i++){
            int end = intervals[i][1];
            int left = i + 1;
            int right = n;
            while(left < right){
                int mid = left + (right - left) / 2;
                int time = intervals[mid][0];

                if(intervals[mid][0] <= end){
                    left = mid + 1;
                }
                else {
                    right = mid;
                }
            }
            count += left - i - 1;
        }
        return count;
    }
}