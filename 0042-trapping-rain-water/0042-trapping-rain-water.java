class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int trappedWater = 0;
        int[] leftMaxBoundary = new int[n];
        int[] rightMaxBoundary = new int[n];

        leftMaxBoundary[0] = height[0];
        for(int i = 1; i < n; i++){
            leftMaxBoundary[i] = Math.max(leftMaxBoundary[i-1], height[i]);
        }

        rightMaxBoundary[n-1] = height[n-1];
        for(int i = n-2; i >= 0; i--){
            rightMaxBoundary[i] = Math.max(rightMaxBoundary[i+1], height[i]);
        }

        for(int i = 0; i < n; i++){
            int waterlevel = Math.min(leftMaxBoundary[i], rightMaxBoundary[i]);
            int currWaterTrap = waterlevel - height[i];
            if(currWaterTrap < 0){
                currWaterTrap= 0;
            }
            trappedWater = trappedWater + currWaterTrap;
        }

        return trappedWater;
    }
}