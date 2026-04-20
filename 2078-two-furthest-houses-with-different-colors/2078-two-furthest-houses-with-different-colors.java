class Solution {
    public int maxDistance(int[] colors) {
        int n = colors.length;

        if(colors[0] != colors[n-1]) return n-1;

        int i = 0;
        while(colors[i] == colors[0]){
            i++;
        }
        int j = n-1;
        while(colors[j] == colors[0]){
            j--;
        }

        int dist = Math.max(j, n-1-i);
        return dist;
    } 
}