class Solution {
    public String digitSum(String s, int k) {

        while(s.length() > k) {
            s = helper(s, k);
        }

        return s;
    }

    private String helper(String s, int k) {

        int n = s.length();
        StringBuilder ans = new StringBuilder();

        for(int i = 0; i < n; i += k) {
            int sum = 0;

            for(int j = i; j < i + k && j < n; j++) {
                sum += s.charAt(j) - '0';
            }

            ans.append(sum);
        }

        return ans.toString();
    }
}