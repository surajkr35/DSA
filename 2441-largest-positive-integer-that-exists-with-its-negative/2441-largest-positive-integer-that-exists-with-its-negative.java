import java.util.*;

class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);

        int i = 0, j = nums.length - 1;
        int ans = -1;

        while (i < j) {
            int sum = nums[i] + nums[j];

            if (sum == 0) {
                ans = Math.max(ans, nums[j]);
                i++;
                j--;
            } 
            else if (sum < 0) {
                i++;
            } 
            else {
                j--;
            }
        }

        return ans;
    }
}