class Solution {
    public int maximumCount(int[] nums) {
        int n = nums.length;

        int firstPos = firstGreater(nums, 0);   
        int firstZero = firstGreater(nums, -1); 

        int neg = firstZero;      
        int pos = n - firstPos;   

        return Math.max(pos, neg);
    }

    private int firstGreater(int[] nums, int target) {
        int left = 0, right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] <= target) left = mid + 1;
            else right = mid;
        }
        return left;
    }
}

// class Solution {
//     public int maximumCount(int[] nums) {
//         int n = nums.length, pos = 0, neg = 0;
//         for(int i = 0; i < n; i++){
//             if(nums[i] > 0) pos++;
//             else if(nums[i] < 0) neg++;
//         }
//         return Math.max(pos, neg);
//     }
// }