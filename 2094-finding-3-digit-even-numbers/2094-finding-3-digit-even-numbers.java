class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int n = digits.length;
        List<Integer> list = new ArrayList<>();
        int[] freq = new int[10];

        for(int num : digits){
            freq[num]++;
        }

        for(int i = 1; i <= 9; i++){
            for(int j = 0; j <= 9; j++){
                for(int k = 0; k <= 8; k+=2){
                    freq[i]--;
                    freq[j]--;
                    freq[k]--;

                    if(freq[i] >= 0 && freq[j] >= 0 && freq[k] >= 0){
                        int num = (i * 100) + (j * 10) + k;
                        list.add(num);
                    }

                    freq[i]++;
                    freq[j]++;
                    freq[k]++;
                }
            }
        }
        int[] ans = new int[list.size()];
        for(int i = 0; i < ans.length; i++){
            ans[i] = list.get(i);
        }

        return ans;
    }
}