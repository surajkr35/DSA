class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int n = moves.length();
        int left = 0, right = 0, space = 0;

        for(int i = 0; i < n; i++){
            char ch = moves.charAt(i);

            if(ch == 'L') left++;
            else if(ch == 'R') right++;
            else space++;
        }

        if(left >= right) return left + space - right;
        else return right + space - left;
    }
}