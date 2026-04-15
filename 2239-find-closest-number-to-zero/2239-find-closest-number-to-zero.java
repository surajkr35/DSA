class Solution {
    public int findClosestNumber(int[] nums) {
        
        int closest = 0;
        int minDist = Integer.MAX_VALUE;

        for (int num : nums) {

            int abs = num < 0 ? -num : num;

            if ((abs < minDist) || (abs == minDist && abs > closest)) {
                closest = num;
                minDist = abs;
            }
        }
        return closest;
    }
}