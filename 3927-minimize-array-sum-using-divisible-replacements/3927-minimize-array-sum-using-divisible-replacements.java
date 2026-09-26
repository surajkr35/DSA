class Solution {
    public long minArraySum(int[] nums) {
        int max = 0;
        long sum = 0;

        for(int num : nums){
            if(num == 1) return nums.length;
            if(num > max){
                max = num;
            }
        }
        int[] min = new int[max+1];

        for(int num : nums){
            min[num] = num;
        }
        
        for(int num : nums){
            if(min[num] < num){
                continue;
            }

            for(int i = num;i <= max;i += num){
                if(num < min[i]) min[i] = num;
            }
        }

        for(int num : nums){
            sum += min[num];
        }

        return sum;
    }
}