class Solution {
    public int[] separateDigits(int[] nums) {
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();

        for(int i = 0; i < n; i++){
            int a = nums[i];
            if(a > 9){
                int x = (int)Math.log10(a);
                int d = (int)Math.pow(10,x);
                while(d > 0){
                    ans.add(a/d);
                    a = a % d;
                    d = d/10;
                }
            }
            else {
                ans.add(a);
            }
        }
        int i = 0;
        int[] arr = new int[ans.size()];
        for(int num : ans){
            arr[i++] = num;
        }
        return arr;
    }
}