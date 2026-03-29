class Solution {
    public int countVisiblePeople(int n, int pos, int k) {
        if(k > n-1){
            return 0;
        }
        int m = 1000000007;
        long num = 1, d = 1;

        int l = Math.min(k, n-1-k);
        for(int i = 1; i < l+1; i++){
            num = (num *(n-i)) % m;
            d = (d * i) % m;
        }
        int r = (int) (num * pow(d, m - 2, m) % m * 2 % m);
        return r;
    }

    private long pow(long x, long y, int z){
        long a = 1;
        for(;y > 0; y /=2){
            if(y % 2 == 1){
                a = (a*x) % z;
            }
            x = (x * x) % z;
        }
        return a;
    }
}