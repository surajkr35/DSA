class Solution {
    public int totalWaviness(int num1, int num2) {
        int ans = 0;

        for(int i = num1; i <= num2; i++){
            int n = i;
            if(n < 100) continue;

            else {
                while(n >= 100){
                    int n1 = n;
                    int right = n1 % 10;
                    n1 = n1 / 10;
                    int mid = n1 % 10;
                    n1 = n1 / 10;
                    int left = n1 % 10;

                    if((left < mid && right < mid) || (left > mid && right > mid)){
                        ans += 1;
                    }
                    n = n / 10;
                }
            }
        }
        return ans;
    }
}