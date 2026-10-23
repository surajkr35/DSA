class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < 2 * n; i++){
            int idx = i % n;
            while(!stack.isEmpty() && nums[stack.peek()] < nums[idx]){
                int index = stack.pop();
                ans[index] = nums[idx];
            }

            if(i < n){
                stack.push(idx);
            }
        }

        return ans;
    }
}
// class Solution {
//     public int[] nextGreaterElements(int[] nums) {
//         int n = nums.length;
//         int[] ans = new int[n];

//         for(int i = 0; i < n; i++){
//             int j = i + 1;

//             while((j % n != i) && (nums[j % n] <= nums[i])){
//                 j++;
//             }
//             ans[i] = (j % n == i) ? -1 : nums[j % n];
//         }

//         return ans;
//     }
// }