class Solution {
    public String[] findWords(String[] words) {
        String s1 = "qwertyuiop";
        String s2 = "asdfghjkl";
        String s3 = "zxcvbnm";

        List<String> ans = new ArrayList<>();

        for(String word : words){
            String s = word.toLowerCase();
            String find;

            if(s1.indexOf(s.charAt(0)) != -1){
                find = s1;
            }
            else if(s2.indexOf(s.charAt(0)) != -1){
                find = s2;
            }
            else {
                find = s3;
            }
            boolean found = true;

            for(char ch : s.toCharArray()){
                if(find.indexOf(ch) == -1){
                    found = false;
                    break;
                }
            }
            
            if(found){
                ans.add(word);
            }
        }

        return ans.toArray(new String[0]);
    }
}