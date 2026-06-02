class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration,
            int[] waterStartTime, int[] waterDuration) {

        int finishTime = Integer.MAX_VALUE;

        int minLandFinish = Integer.MAX_VALUE;
        for (int i = 0; i < landStartTime.length; i++) {
            minLandFinish = Math.min(
                    minLandFinish,
                    landStartTime[i] + landDuration[i]);
        }

        for (int j = 0; j < waterStartTime.length; j++) {
            finishTime = Math.min(
                    finishTime,
                    Math.max(minLandFinish, waterStartTime[j]) + waterDuration[j]);
        }

        int minWaterFinish = Integer.MAX_VALUE;
        for (int i = 0; i < waterStartTime.length; i++) {
            minWaterFinish = Math.min(
                    minWaterFinish,
                    waterStartTime[i] + waterDuration[i]);
        }

        for (int j = 0; j < landStartTime.length; j++) {
            finishTime = Math.min(
                    finishTime,
                    Math.max(minWaterFinish, landStartTime[j]) + landDuration[j]);
        }

        return finishTime;
    }
}