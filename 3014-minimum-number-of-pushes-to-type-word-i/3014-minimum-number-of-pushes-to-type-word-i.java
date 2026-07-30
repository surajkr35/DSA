class Solution {
    public int minimumPushes(String word) {
        int cost = 0;
        for (int i = 0; i < word.length(); i++) {
            cost += i / 8 + 1;
        }
        return cost;
    }
}
// class Solution {
//     public int minimumPushes(String word) {
//         int n = word.length();
//         int cost = 0;
//         if(n <= 8){
//             cost = n;
//         }
//         else if(n <=16){
//             cost = 8 + (n-8)*2;
//         }
//         else if(n <= 24){
//             cost = 24 + (n-16) * 3;
//         }
//         else {
//             cost = 48 + (n-24)*4;
//         }

//         return cost;
//     }
// }