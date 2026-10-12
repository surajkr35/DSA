class BusBooking {
    private int[][] rows;
    private int[][] costs;
    private int totalTime = 0;
    private int bookedCount = 0;

    public BusBooking(int n) {
        rows = new int[n][4];
        costs = new int[n][4];
    }

    public void toggle(String seat) {
        int r = Integer.parseInt(seat.substring(1)) - 1;
        int no = seat.charAt(0) - 'A';


        if(rows[r][no] == 1){
            totalTime -= costs[r][no];
            costs[r][no] = 0;
            rows[r][no] = 0;
            bookedCount--;
        } 
        else{
            int time = 1;

            if(no == 0 && rows[r][1] == 1){
                time = 3;
            } 
            else if(no == 3 && rows[r][2] == 1){
                time = 3;
            }

            rows[r][no] = 1;
            costs[r][no] = time;
            totalTime += time;
            bookedCount++;
        }
    }

    public int getTotalTime() {
        return totalTime;
    }

    public int getMinTime() {
        return bookedCount;
    }
}

/**
 * Your BusBooking object will be instantiated and called as such:
 * BusBooking obj = new BusBooking(n);
 * obj.toggle(seat);
 * int param_2 = obj.getTotalTime();
 * int param_3 = obj.getMinTime();
 */