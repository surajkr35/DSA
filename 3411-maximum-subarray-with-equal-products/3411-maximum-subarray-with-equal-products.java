class Solution {
    public int maxLength(int[] nums) {
        int n = nums.length;
        int len = 0;

        for(int i = 0; i < n; i++){
            int pro = 1;
            int gcd = 0;
            int lcm = 1;

            for(int j = i; j < n; j++){
                pro *= nums[j];

                gcd = GCD(gcd, nums[j]);
                lcm = LCM(lcm, nums[j]);

                if(pro == lcm * gcd){
                    len = Math.max(len, j - i + 1);
                }
            }
        }

        return len;
    }

    private int GCD(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private int LCM(int a, int b){
        return (a / GCD(a, b)) * b;
    }
}