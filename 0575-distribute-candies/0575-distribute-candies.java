class Solution {
    public int distributeCandies(int[] candyType) {
        Arrays.sort(candyType);

        int count = 1;
        int target = candyType.length / 2;

        for(int i = 1; i < candyType.length; i++){
            if(count == target){
                return target;
            }
            if(candyType[i] != candyType[i-1]){
                count++;
            }
        }
        return count;
    }
}