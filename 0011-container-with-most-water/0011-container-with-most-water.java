class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n-1;
        int maxWater = 0;

        while(left < right){
            int width = right - left;
            int minHeight = Math.min(height[right], height[left]);

            maxWater = Math.max(maxWater, width*minHeight);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
            
        }
        return maxWater;
    }
}