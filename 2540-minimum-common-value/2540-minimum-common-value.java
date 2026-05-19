class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;

        if(nums1[0] == nums2[0]) return nums1[0];
        else if(n1 < n2){
            for(int i = 0; i < n1; i++){
                if(Search(nums2, nums1[i])) return nums1[i];
            }
        }
        else {
            for(int i = 0; i < n2; i++){
                if(Search(nums1, nums2[i])) return nums2[i];
            }
        }
        return -1;
    }

    private Boolean Search(int arr[], int key){
        int n = arr.length;
        int left = 0, right = n-1;

        while(left <= right){
            int mid = left + (right - left)/2;

            if(arr[mid] == key) return true;
            else if(arr[mid] < key) left = mid+1;
            else right = mid-1;
        }
        return false;
    }
}