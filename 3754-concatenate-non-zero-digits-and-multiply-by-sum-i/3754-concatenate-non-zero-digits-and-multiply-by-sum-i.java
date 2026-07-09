class Solution {
    public long sumAndMultiply(int n) {
        int rev = 0;
        long sum = 0;
        long num = 0;

        while(n > 0){
            int r = n % 10;
            sum = sum + r;

            if(r != 0){
                rev = rev * 10 + r;
            }
            n = n / 10;
        }
        while(rev > 0){
            num = num * 10 + rev % 10;
            rev = rev / 10;
        }

        return num * sum;
    }
}