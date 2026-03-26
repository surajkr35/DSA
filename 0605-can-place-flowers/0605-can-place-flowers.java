class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int s = flowerbed.length;
        int count = 0;

        for(int i = 0; i < s; i++){
            if(flowerbed[i] == 0){
                boolean checkLeft = (i == 0 || flowerbed[i-1] == 0);
                boolean checkRight = (i == s-1 || flowerbed[i+1] == 0);

                if(checkLeft && checkRight){
                    count++;
                    i++;
                    if(count >= n){
                        return true;
                    }
                }
            }
        }
        return count >= n;
    }
}