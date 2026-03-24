class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int[] count = new int[3];
        for (int i = 0; i < n; i++) {
            count[nums[i]]++;
        }
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (count[k] == 0) {
                do{
                    k++;
                }
                while(count[k] ==0);
            }
                nums[i] = k;
                count[k]--;
            
        }
    }
}