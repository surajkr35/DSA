class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        List<Character> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        if(n % 2 == 0){
            for(int i = 0; i < n/2; i++){
                list.add(s.charAt(i));
            }
            Collections.sort(list);
            for(char ch : list){
                sb.append(ch);
            }
            return sb.toString() + sb.reverse().toString();
        }
        else {
            for(int i = 0; i < n/2; i++){
                list.add(s.charAt(i));
            }
            Collections.sort(list);
            for(char ch : list){
                sb.append(ch);
            }
            return sb.toString() + s.charAt(n/2) + sb.reverse().toString();
        }
    }
}