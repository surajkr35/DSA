class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int fuel = 0;
        int total = 0;
        int st = 0;

        for(int i = 0; i < n; i++){
            int gain = gas[i] - cost[i];
            fuel += gain;
            total += gain;

            if(fuel < 0){
                st = i + 1;
                fuel = 0;
            }
        }
        return total >= 0 ? st : -1;
    }
}