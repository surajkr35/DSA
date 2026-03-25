class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int n = nums1.length;
        int m = nums2.length;
        int[] res = new int[Math.min(n, m)];
        int k = 0, a = 0, b = 0;

        while (a < n && b < m) {
            if (nums1[a] == nums2[b]) {
                res[k++] = nums1[a];
                a++;
                b++;
            } else if (nums1[a] < nums2[b]) {
                a++;
            } else {
                b++;
            }
        }
        
        // Copy the valid portion of the array
        return Arrays.copyOfRange(res, 0, k);
    }
}