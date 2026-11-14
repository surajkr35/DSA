class Solution {
    public List<List<String>> findMismatchedSegments(String s1, String s2) {
        int n = s1.length();
        List<List<String>> ans = new ArrayList<>();

        int i = 0;

        while(i < n){
            if(s1.charAt(i) != s2.charAt(i)){
                int start = i;

                while(i < n && s1.charAt(i) != s2.charAt(i)){
                    i++;
                }

                List<String> temp = new ArrayList<>();

                temp.add(s1.substring(start, i));
                temp.add(s2.substring(start, i));

                ans.add(temp);

            } 
            else{
                i++;
            }
        }

        return ans;
    }
}
