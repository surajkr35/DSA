class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;

        for(int num : nums){
            if((int) Math.log10(num) % 2 == 1){
                count++;
            }
        }
        return count;
    }
}

// _______________________________________________
    // ~ Using Function 

// class Solution {
//     public int findNumbers(int[] nums) {
//         int n = nums.length;
//         int count = 0;

//         for(int num : nums){
//             if(digitCount(num) % 2 == 0){
//                 count++;
//             }
//         }
//         return count;
//     }
    
//     private int digitCount(int n){
//         int count = 0;
//         while(n > 0){
//             n = n / 10;
//             count++;
//         }
//         return count;
//     }
// }
