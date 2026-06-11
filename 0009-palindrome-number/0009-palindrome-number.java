class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revHalf = 0;

        while (x > revHalf) {
            revHalf = revHalf * 10 + x % 10;
            x /= 10;
        }

        return x == revHalf || x == revHalf / 10;
    }
}

// class Solution {
//     public boolean isPalindrome(int x) {
//         if(x < 0) return false;
//         int n = x;
//         int rev = 0;

//         while(n > 0){
//             int r = n % 10;
//             rev = rev * 10 + r;
//             n = n / 10;
//         }
//         if(rev == x) return true;

//         return false;
//     }
// }