class Solution {
    public long minimumMaxValue(int n, int index, int value) {
        long ans = value;
        
        if(value == 1){
            return -1;
        }

        for(long i = 2; i * i <= value; i++){
            if(value % i == 0){
                ans = i;
                break;
            }
        }

        long left = 0;
        if(value % 2 == 0){
            left = value / 2 - 1;
        }
        else {
            left = (value - ans) / 2;
        }

        if(index > left){
            return -1;
        }

        long right = (long) n - 1 - index;

        if(right == 0){
            return value;
        }
        if(value % 2 == 0){
            return value + 2 * right;
        }
        else {
            return value  + ans + 2 * (right - 1);
        }
    }
}