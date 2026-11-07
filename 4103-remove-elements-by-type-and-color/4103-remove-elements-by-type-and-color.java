class Solution {
    public boolean canRemoveAll(int[] types, int[] colors, int[] groupSize) {
        int n = types.length;
        Stack<int[]> st = new Stack<>();

        for(int i = 0; i < n; i++){
            int t = types[i];
            int c = colors[i];

            if(!st.isEmpty() && st.peek()[0] == t && st.peek()[1] == c){
                st.peek()[2]++;
            }

            else{
                st.push(new int[]{t, c, 1});
            }

            if(st.peek()[2] == groupSize[t]){
                st.pop();
            }
        }
        return st.isEmpty();
    }
}