class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int[] even = new int[101];
        int[] odd = new int[101];
        int n = nums.length;

        for (int i = 0; i < n; i += 2) {
            even[nums[i]]++;
        }
        for (int i = 1; i < n; i += 2) {
            odd[nums[i]]++;
        }
        int k = 0;
        for (int i = 0; i < even.length; i++) {
            while (even[i] != 0) {
                nums[k] = i;
                even[i]--;
                k += 2;
            }

        }
        k = 1;
        for (int i = odd.length - 1; i >= 0; i--) {
            while (odd[i] != 0) {
                nums[k] = i;
                odd[i]--;
                k += 2;
            }

        }
        return nums;
    }
}