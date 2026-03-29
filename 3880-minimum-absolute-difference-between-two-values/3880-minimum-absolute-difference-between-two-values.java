class Solution {
    public int minAbsoluteDifference(int[] nums) {
        int n = nums.length;
        int one = -1, two = -1;
        int minDif = Integer.MAX_VALUE, dif = 0;

        for(int i = 0; i < n; i++){
            if(nums[i] == 1){
                one = i;
            }
            if(nums[i] == 2){
                two = i;
            }
            if(one >= 0 && two >= 0){
                dif = Math.abs(one - two);
                minDif = Math.min(minDif, dif);
            }
        }
        if(minDif == Integer.MAX_VALUE){
            minDif = -1;
        }
        return minDif;
    }
}