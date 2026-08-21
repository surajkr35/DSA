//   ~ Optimized Approach (Two - Pointers)  - O(n) Time Complexuty

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int[] ans = new int[2];

        int left = 0;
        int right = n - 1;

        while(left < right){
            int sum = numbers[left] + numbers[right];

            if(sum == target){
                ans[0] = left + 1;
                ans[1] = right + 1;
                break;
            }
            else if(sum > target){
                right--;
            }
            else {
                left++;
            }
        }
        return ans;
    }
}

// ______________________________________________________________________ 

    // ~ Brute Force  - O(n2) Time Complexity

// class Solution {
//     public int[] twoSum(int[] numbers, int target) {
//         int n = numbers.length;

//         for(int i = 0; i < n; i++){

//             for(int j = i + 1; j < n; j++){
//                 if(numbers[j] == target - numbers[i]){
//                     return new int[] {i + 1, j + 1};
//                 }
//                 else if(numbers[j] + numbers[i] > target){
//                     break;
//                 }
//             }
//         }
//         return new int[2];
//     }
// }
//   _____________________________________________________________

//   ~ Binary Search Approach  - O(n log n) Time Complexity

// class Solution {
//     public int[] twoSum(int[] numbers, int target) {
//         int n = numbers.length;

//         for (int i = 0; i < n; i++) {
//             int complement = target - numbers[i];

//             int left = i + 1;
//             int right = n - 1;

//             while (left <= right) {
//                 int mid = left + (right - left) / 2;

//                 if (numbers[mid] == complement) {
//                     return new int[] {i + 1, mid + 1};
//                 }
//                 else if (numbers[mid] < complement) {
//                     left = mid + 1;
//                 }
//                  else {
//                     right = mid - 1;
//                 }
//             }
//         }

//         return new int[2];
//     }
// }