class Solution {
    public boolean checkPerfectNumber(int num) {
        //  By Euclid–Euler Theorem (Math Trick)
        // for a number to be perfect number
        // n = 2^(p−1) × (2^p − 1)  
        // p must be prime number  ---- 2 , 3 , 5 , 7 ....
        
        int[] primes = {2, 3, 5, 7, 13};
        for (int p : primes) {
            int m = (int)Math.pow(2, p) - 1;
            int perfect = (int)Math.pow(2, p - 1) * m;

            if (perfect == num) {
                return true;
            }
        }
        return false;
    }
}
// class Solution {
//     public boolean checkPerfectNumber(int num) {
//         if (num <= 1) return false;

//         int sum = 1;

//         for (int i = 2; i <= Math.sqrt(num); i++) {
//             if (num % i == 0) {
//                 sum += i;
//                 if (i != num / i) {
//                     sum += num / i;
//                 }
//             }
//         }

//         return sum == num;
//     }
// }
// 