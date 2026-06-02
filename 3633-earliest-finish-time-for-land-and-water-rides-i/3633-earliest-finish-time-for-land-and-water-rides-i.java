class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int n = landStartTime.length;
        int m = waterStartTime.length;
        int finishTime = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++){
            int time = landStartTime[i] + landDuration[i];

            for(int j = 0; j < m; j++){
                if(time < waterStartTime[j]){
                    finishTime = Math.min(finishTime, waterStartTime[j] + waterDuration[j]);
                }

                else {
                    finishTime = Math.min(finishTime, time + waterDuration[j]);
                }
            }

        }

        for(int i = 0; i < m; i++){
            int time = waterStartTime[i] + waterDuration[i];

            for(int j = 0; j < n; j++){
                if(time < landStartTime[j]){
                    finishTime = Math.min(finishTime, landStartTime[j] + landDuration[j]);
                }

                else {
                    finishTime = Math.min(finishTime, time + landDuration[j]);
                }
            }

        }

        return finishTime;
    }

}