class Solution {
    public long maximizeSum(int[] nums, int k) {
        int n = nums.length;
        long sum = 0;
        long[] extra = new long[n];

        for(int i = 0; i < n; i++){
            sum += nums[i];

            int[] freq = new int[10];
            int num = nums[i];

            while(num > 0){
                int r = num % 10;
                freq[r]++;
                num /= 10;
            }

            long large = 0;

            for(int x = 9; x >= 0; x--){
                for(int y = 0; y < freq[x]; y++){
                    large = large * 10 + x;
                }
            }

            extra[i] = large - nums[i];
        }

        Arrays.sort(extra);

        for(int i = 0; i < k && i < n; i++){
            sum += extra[n - 1 - i];
        }

        return sum;
    }
}