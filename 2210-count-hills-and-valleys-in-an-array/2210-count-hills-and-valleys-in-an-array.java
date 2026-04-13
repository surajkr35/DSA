class Solution {
    public int countHillValley(int[] nums) {
        int count = 0;

        int prev = nums[0];

        for (int i = 1; i < nums.length - 1; i++) {

            if (nums[i] == prev) continue;

            int next = i + 1;

            while (next < nums.length && nums[next] == nums[i]) {
                next++;
            }

            if (next == nums.length) break;

            if ((nums[i] > prev && nums[i] > nums[next]) ||
                (nums[i] < prev && nums[i] < nums[next])) {
                count++;
            }

            prev = nums[i];
        }

        return count;
    }
}

// class Solution {
//     public int countHillValley(int[] nums) {
//         int n = nums.length, count = 0;

//         for (int i = 1; i < n - 1; i++) {
//             if (nums[i] == nums[i - 1]) continue;

//             int left = i - 1, right = i + 1;

//             while (left >= 0 && nums[left] == nums[i]) left--;
//             while (right < n && nums[right] == nums[i]) right++;

//             if (left >= 0 && right < n) {
//                 if ((nums[left] > nums[i] && nums[right] > nums[i]) ||
//                     (nums[left] < nums[i] && nums[right] < nums[i])) {
//                     count++;
//                 }
//             }
//         }

//         return count;
//     }
// }