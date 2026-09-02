    // ~ Optimal Solution (Boyer–Moore Voting Algorithm)  ~ O(n) Time & O(1) Space Complexity

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int count1 = 0, count2 = 0;
        int num1 = Integer.MIN_VALUE, num2 = Integer.MIN_VALUE;
        List<Integer> ans = new ArrayList<>();

        for(int i = 0; i < n; i++){
            if(count1 == 0 && num2 != nums[i]){
                num1 = nums[i];
                count1++;
            }
            else if(count2 == 0 && num1 != nums[i]){
                num2 = nums[i];
                count2++;
            }
            else if(nums[i] == num1){
                count1++;
                
            }
            else if(nums[i] == num2){
                count2++;
                
            }
            else {
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;

        for(int num : nums){
            if(num == num1) count1++;
            else if(num == num2) count2++;
        }

        if(count1 > n / 3){
            ans.add(num1);
        }
        if(count2 > n / 3){
            ans.add(num2);
        }
        return ans;
    }
}
// _________________________________________________________________
    // ~ Using Sorting 

// class Solution {
//     public List<Integer> majorityElement(int[] nums) {
//         int n = nums.length;
//         List<Integer> ans = new ArrayList<>();
//         Arrays.sort(nums);

//         int count = 1;

//         for(int i = 0; i < n - 1; i++){
//             if(nums[i] == nums[i + 1]){
//                 count++;
//             }
//             else {
//                 if(count > n / 3){
//                     ans.add(nums[i]);
//                 }
//                 count = 1;
//             }
//         }
//         if(count > n / 3){
//             ans.add(nums[n - 1]);
//         }

//         return ans;
//     }
// }