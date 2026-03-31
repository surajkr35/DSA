class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int beg = 0;
        int end = n - 1;
        while(beg <= end){
            int mid = end + (beg - end) / 2;
            if(nums[mid] == target){
                return mid;
            }
            else if(target > nums[mid]){
                beg = mid + 1;
            }
            else{
                end = mid - 1;
            }

        }
        return -1;
    }
}