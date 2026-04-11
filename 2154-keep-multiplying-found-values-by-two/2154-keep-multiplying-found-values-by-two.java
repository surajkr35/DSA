class Solution {
    public int findFinalValue(int[] nums, int original) {
        boolean present = true;
        while(present){
            if(check(nums, original)){
                original *= 2;
            }
            else {
                present = false;;
            }
        }
        return original;
    }

    private boolean check(int[] nums, int original){
        for(int i = 0; i < nums.length; i++){
            if(original == nums[i]){
                return true;
            }
        }
        return false;
    }
}

// class Solution {
//     public int findFinalValue(int[] nums, int original) {
//         HashSet<Integer> set = new HashSet<>();
        
//         for(int num : nums){
//             set.add(num);
//         }
//         while(set.contains(original)){
//             original *= 2;
//         }
//         return original;
//     }
// }