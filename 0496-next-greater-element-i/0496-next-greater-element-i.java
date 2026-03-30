class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;

        for(int i = 0; i < n1; i++){
            int num = nums1[i];
            for(int j = 0; j < n2; j++){
                if(nums2[j] == num){
                    nums1[i] = j;
                }
            }
        }
        for(int i = 0; i < n1; i++){
            int key = nums1[i];
            for(int j = nums1[i]; j < n2; j++){
                if(nums2[j] > nums2[key]){
                    nums1[i] = nums2[j];
                    break;
                }
                else{
                    nums1[i] = -1;
                }
            }
        }
        return nums1;
    }
}