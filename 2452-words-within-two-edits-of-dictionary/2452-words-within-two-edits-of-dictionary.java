class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        
        List<String> ans = new ArrayList<>();
        for(String querie : queries){
            for(String s : dictionary) {
                int dist = 0;
                for(int i = 0; i < querie.length(); i++){
                    if(querie.charAt(i) != s.charAt(i)){
                        dist++;
                    }
                }
                if(dist <= 2){
                    ans.add(querie);
                    break;
                }
                
            }
        }
        return ans;
    }
}