class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        ans.add(list);

        helper(1, numRows, list, ans);

        return ans;
    }
    private void helper(int k, int n, List<Integer> list, List<List<Integer>> ans){
        if(k == n){
            return;
        }
        List<Integer> temp = new ArrayList<>();
        temp.add(1);
        
        for(int i = 0; i < list.size()-1; i++){
            int num = list.get(i) + list.get(i + 1);
            temp.add(num);
        }
        temp.add(1);
        ans.add(new ArrayList<>(temp));

        helper(k + 1, n, temp, ans);
    }
}

// class Solution {
//     public List<List<Integer>> generate(int numRows) {
//         List<List<Integer>> ans = new ArrayList<>();

//         for(int i = 0; i < numRows; i++){
//             List<Integer> temp = new ArrayList<>();

//             for(int j = 0; j <= i; j++){
//                 if(j == 0 || j == i){
//                     temp.add(1);
//                 }
//                 else {
//                     temp.add(ans.get(i - 1).get(j-1) + ans.get(i - 1).get(j));
//                 }
//             }
//             ans.add(temp);
//         }
//         return ans;
//     }
// }