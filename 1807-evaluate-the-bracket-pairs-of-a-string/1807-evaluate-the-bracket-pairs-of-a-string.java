class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        Map<String, String> map = new HashMap<>();

        for(List<String> row : knowledge){
            map.put(row.get(0), row.get(1));
        }
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == '('){
                int startIdx = i + 1;
                int endIdx = s.indexOf(')', startIdx);

                String key = s.substring(startIdx, endIdx);

                String value = map.getOrDefault(key.toString() , "?");

                sb.append(value);

                i = endIdx;
            } 
            else {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }
}
