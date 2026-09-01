class Solution {
    public int minBishopMoves(int[] source, int[] target) {
        int n1 = source[0] + source[1];
        int n2 = target[0] + target[1];

        if(n1 % 2 == 0 && n2 % 2 != 0 || n1 % 2 != 0 && n2 % 2 == 0){
            return -1;
        }

        if(Math.abs(source[0] - target[0]) == Math.abs(source[1] - target[1])){
            return 1;
        }
        else {
            return 2;
        }
    }
}