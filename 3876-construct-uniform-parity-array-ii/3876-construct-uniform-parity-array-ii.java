class Solution {
    public boolean uniformArray(int[] nums1) {
        int n = nums1.length;
        int oddMin = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++){
            if(nums1[i] % 2 != 0){
                oddMin = Math.min(oddMin, nums1[i]);
            }
        }

        if(oddMin == Integer.MAX_VALUE){
            return true;
        }

        for(int i = 0; i < n; i++){
            if(nums1[i] % 2 == 0){
                if(nums1[i] - oddMin < 1){
                    return false;
                }
            }
        }
        return true;
    }
}