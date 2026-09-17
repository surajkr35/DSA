class Solution {
    public int addDigits(int num) {
        int sum = num;
        while(sum > 9){
            sum = digitSum(sum);
        }

        return sum;
    }
    private int digitSum(int n){
        int sum = 0;
        while(n > 0){
            int r = n % 10;
            sum += r;
            n = n / 10;
        }

        return sum;
    }
}