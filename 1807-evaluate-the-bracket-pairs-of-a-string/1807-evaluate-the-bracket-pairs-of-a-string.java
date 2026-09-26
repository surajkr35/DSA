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
                i++;

                StringBuilder key = new StringBuilder();

                while(s.charAt(i) != ')'){
                    key.append(s.charAt(i));
                    i++;
                }

                String value = map.getOrDefault(key.toString() , "?");

                sb.append(value);
            } 
            else {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }
}
