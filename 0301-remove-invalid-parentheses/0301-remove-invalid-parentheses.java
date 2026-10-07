class Solution {
    Set<String> ans = new HashSet<>();

    public List<String> removeInvalidParentheses(String s) {
        int left = 0;
        int right = 0;

        for(char ch : s.toCharArray()){
            if(ch == '('){
                left++;
            }
            else if(ch == ')'){
                if(left > 0){
                    left--;
                }
                else {
                    right++;
                }
            }
        }

        helper(s, 0, left, right, new StringBuilder());

        return new ArrayList<>(ans);
    }

    private boolean isValid(String s){
        int count = 0;

        for(char ch : s.toCharArray()){
            if(ch == '('){
                count++;
            }
            else if(ch == ')'){
                count--;

                if(count < 0){
                    return false;
                }
            }
        }
        return count == 0;
    }

    private void helper(String s, int i, int left, int right, StringBuilder sb){
        if(i == s.length()){
            if(left == 0 && right == 0 && isValid(sb.toString())){
                ans.add(sb.toString());
            }

            return;
        }

        char ch = s.charAt(i);

        if(ch == '(' && left > 0){
            helper(s, i + 1, left - 1, right, sb);
        }

        if(ch == ')' && right > 0){
            helper(s, i + 1, left, right - 1, sb);
        }

        sb.append(ch);

        helper(s, i + 1, left, right, sb);

        sb.deleteCharAt(sb.length() - 1);

    }
}