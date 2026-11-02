class Solution {

    public int minMoves2(int[] nums) {

        int n = nums.length;

        int med = findMediun(nums, 0, n - 1, n / 2);

        int ans = 0;

        for(int num : nums){
            ans += Math.abs(num - med);
        }

        return ans;
    }

    int findMediun(int[] nums, int low, int high, int k) {

        int pivot = nums[high];
        int i = low;

        for(int j = low; j < high; j++){
            if(nums[j] <= pivot){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                i++;
            }
        }

        int temp = nums[i];
        nums[i] = nums[high];
        nums[high] = temp;

        if(i == k){
            return nums[i];
        }

        if(i > k){
            return findMediun(nums, low, i - 1, k);
        }

        return findMediun(nums, i + 1, high, k);
    }
}

// class Solution {
//     public int minMoves2(int[] nums) {
//         int n = nums.length;
//         int ans = 0;

//         Arrays.sort(nums);
//         int mid = n / 2;

//         for(int i = 0; i < n; i++){
//             ans += Math.abs(nums[i] - nums[mid]);
//         }

//         return ans;
//     }
// }