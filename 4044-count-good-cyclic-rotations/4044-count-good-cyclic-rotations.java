class Solution {
    public int countGoodRotations(int[] nums) {
        int n = nums.length;
        long totalSum = 0;
        int count = 0;

        for(int i = 0; i < n; i++){
            totalSum += nums[i];
        }

        int winSize = n / 2;
        long winSum = 0;

        for(int i = 0; i < winSize; i++){
            winSum += nums[i];
        }

        for(int i = 0; i < n; i++){
            if(winSum > totalSum - winSum){
                count++;
            }

            winSum -= nums[i];
            winSum += nums[(winSize + i) % n];
        }

        return count;
    }
}