class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> map = new HashMap<>();
        int n = pattern.length();
        String[] words = s.split("\\s+");
        if(n != words.length){
            return false;
        }

        for(int i = 0; i < n; i++){
            char ch = pattern.charAt(i);
            String word = words[i];

            if(map.containsKey(ch)){
                if(!map.get(ch).equals(word)){
                    return false;
                }
            }
            else if(map.containsValue(word)){
                return false;
            }

            map.put(ch, word);
        }

        return true;
    }
}