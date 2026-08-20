class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;
        if(n <= 2) return nums;

        int[] res = new int[n];
        
        int left = 0;      
        int right = n - 1; 

        res[left++] = nums[0];
        res[right--] = nums[1];

        int last1 = nums[0];
        int last2 = nums[1];

        for(int i = 2; i < n; i++){
            if(last1 > last2){
                res[left++] = nums[i];
                last1 = nums[i];
            }
             else {
                res[right--] = nums[i];
                last2 = nums[i];
            }
        }
        int i = right + 1;
        int j = n - 1;

        while(i < j){
            int temp = res[i];
            res[i] = res[j];
            res[j] = temp;
            i++;
            j--;
        }
        return res;
    }

}