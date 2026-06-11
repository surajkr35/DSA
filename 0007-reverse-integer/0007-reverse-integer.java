class Solution {
    public int reverse(int x) {
        long ans;

        if(x < 0){
            ans = -rev(-(long)x);
        }
        
        else{
            ans = rev(x);
        }

        if(ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE){
            return 0;
        }

        return (int) ans;
    }

    private long rev(long n){
        long ans = 0;

        while(n > 0){
            int r = (int)(n % 10);
            ans = ans * 10 + r;
            n /= 10;
        }

        return ans;
    }
}