class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int minIdx = -1;
        int maxIdx = -1;

        for(int i = 0; i < n; i++){
            if(nums[i] < min){
                min = nums[i];
                minIdx = i;
            }
            if(nums[i] > max){
                max = nums[i];
                maxIdx = i;
            }
        }

        int rightIdx = Math.max(minIdx, maxIdx);
        int leftIdx = Math.min(minIdx, maxIdx);

        int case1 = rightIdx + 1;
        int case2 = n - leftIdx;
        int case3 = (leftIdx + 1) + (n - rightIdx);

        return Math.min(case1, Math.min(case2, case3));
    }
}