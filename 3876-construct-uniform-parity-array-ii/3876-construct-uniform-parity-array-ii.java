class Solution {
    public boolean uniformArray(int[] nums1) {
        int n = nums1.length;
        int min = Integer.MAX_VALUE;
        boolean allEven = true;;

        for(int i = 0; i < n; i++){
            min = Math.min(min, nums1[i]);
            if(nums1[i] % 2 != 0){
                allEven = false;
            }
        }

        return min % 2 != 0 || allEven;
    }
}