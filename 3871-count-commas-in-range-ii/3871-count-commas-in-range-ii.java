class Solution {
    public long countCommas(long n) {
        long ans = 0;
        long dig = 1000;

        while(dig <= n){
            ans += n - dig + 1;
            dig = dig * 1000;
        }
        return ans;
    }
}
// -_______________________________________________________________
    // ~ Direct Analysis

// class Solution {
//     public long countCommas(long n) {
//         long c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 0;

//         if(n < 1000){
//             return 0;
//         }
//         if(n >= 1000){
//             c1 = n - 999;
//         }
//         if(n >= 1000000){
//             c2 = n - 999999;
//         }
//         if(n >= 1000000000){
//             c3 = n - 999999999;
//         }
//         if(n >= 1000000000000L){
//             c4 = n - 999999999999L;
//         }
//         if(n >= 1000000000000000L){
//             c5 = n - 999999999999999L;
//         }

//         return c1 + c2 + c3 + c4 + c5;
//     }
// }