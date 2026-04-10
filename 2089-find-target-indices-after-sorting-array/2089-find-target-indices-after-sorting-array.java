// Optimized Approach   ~ O(n) Time Complexity

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int less = 0, equal = 0;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < target)
                less++;
            else if (nums[i] == target)
                equal++;
        }

        for (int i = less; i < less + equal; i++) {
            list.add(i);
        }
        return list;
    }
}
// Brute Force Approach    ~ n log(n) Time Complexity

// class Solution {
//     public List<Integer> targetIndices(int[] nums, int target) {
//         Arrays.sort(nums);
//         int n = nums.length;
//         ArrayList<Integer> list = new ArrayList<>();

//         for(int i = 0; i < n; i++){
//             if(nums[i] == target){
//                 list.add(i);
//             }
//         }
//         return list;
//     }
// }