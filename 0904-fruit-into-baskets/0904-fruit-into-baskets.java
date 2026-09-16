class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        if(n <= 2){
            return n;
        }
        int left = 0;
        int len = 0;

        int num1 = -1;
        int num2 = -1;
        int count1 = 0;
        int count2 = 0;

        for(int right = 0; right < n; right++){
            if(fruits[right] == num1 || num1 == -1){
                count1++;
                num1 = fruits[right];
            }
            else if(fruits[right] == num2 || num2 == -1){
                count2++;
                num2 = fruits[right];
            }
            else {
                while(count1 > 0 && count2 > 0){
                    if(fruits[left] == num1){
                        count1--;
                        left++;
                    }
                    else if(fruits[left] == num2){
                        count2--;
                        left++;
                    } 
                }
                if(count1 == 0){
                    num1 = fruits[right];
                    count1 = 1;
                }
                else{
                    num2 = fruits[right];
                    count2 = 1;
                }
            }
            len = Math.max(len, right - left + 1);
        }
        return len;
    }
}