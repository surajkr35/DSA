class Solution {
    public int missingInteger(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        int sum = nums[0];

        for(int num : nums){
            set.add(num);
        }
        for(int i = 0; i < n-1; i++){
            if(nums[i] + 1 == nums[i+1]){
                sum += nums[i+1];
            }
            else {
                break;
            }
        }
        while(set.contains(sum)){
            sum++;
        }

        return sum;
    }
}