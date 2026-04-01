class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int n = num_people;
        int x = 1, sum = 0, i = 0;
        int[] res = new int[n];

        while(sum < candies){
            if(i == n){
                i = 0;
            }
            if(x <= candies-sum){
                res[i] = res[i] + x;
                sum = sum + x;
                i++;
                x++;
            }
            else{
                res[i] = res[i] + candies - sum;
                sum = sum + candies - sum;
            }
        }
        return res;
    }
}
// class Solution {
//     public int[] distributeCandies(int candies, int num_people) {
//         int[] res = new int[num_people];
        
//         int give = 1;  
//         int i = 0;     
        
//         while (candies > 0) {
//             res[i % num_people] += Math.min(give, candies);
//             candies -= give;
//             give++;
//             i++;
//         }
        
//         return res;
//     }
// }