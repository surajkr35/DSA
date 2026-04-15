class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int n = words.length;
        int leftDist = Integer.MAX_VALUE, rightDist = Integer.MAX_VALUE, minDist = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            if(words[(startIndex + i) % n].equals(target)){
                rightDist = i;
            }
            if(words[(startIndex - i + n) % n].equals(target)){
                leftDist = i;
            }
            int prevMin = minDist;
            minDist = Math.min(rightDist, leftDist);
            if(prevMin != minDist) return minDist;
        }
        return -1;
    }
}