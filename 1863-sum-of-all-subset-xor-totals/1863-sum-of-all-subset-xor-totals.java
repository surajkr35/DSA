class Solution {
    int sum = 0;

    public int subsetXORSum(int[] nums) {
        subsetXOR(nums, 0, 0);

        return sum;
    }

    private void subsetXOR(int[] nums, int i, int XOR){
        if(i == nums.length){
            sum += XOR;
            return;
        }

        subsetXOR(nums, i + 1, XOR ^ nums[i]);

        subsetXOR(nums, i + 1, XOR);

    }
}