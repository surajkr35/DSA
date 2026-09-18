class Solution {
    public char findTheDifference(String s, String t) {
        char ans = 0;
        for(char ch : s.toCharArray()){
            ans ^= ch;
        }

        for(char ch : t.toCharArray()){
            ans ^= ch;
        }

        return ans;
    }
}
// _________________________________________________

    // ~ Using Freqency Array   ~  O(n) Time & O(26) ~ O(1) Space Complexity

// class Solution {
//     public char findTheDifference(String s, String t) {
//         int n = s.length();

//         int[] freq = new int[26];

//         for(int i = 0; i < n; i ++){
//             char ch = s.charAt(i);
//             freq[ch - 'a']++;
//         }

//         for(int i = 0; i < t.length(); i++){
//             char ch = t.charAt(i);
//             if(freq[ch - 'a'] == 0){
//                 return ch;
//             }
//             else {
//                 freq[ch - 'a']--;
//             }
//         }
//         return 'a';
//     }
// }