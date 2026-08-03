class Solution {
    public int maxNumberOfBalloons(String text) {
        int n = text.length();
        char[] ch = new char[5];

        for(int i = 0; i < n; i++){
            if(text.charAt(i) == 'b'){
                ch[0]++;
            }
            else if(text.charAt(i) == 'a'){
                ch[1]++;
            }
            else if(text.charAt(i) == 'l'){
                ch[2]++;
            }
            else if(text.charAt(i) == 'o'){
                ch[3]++;
            }
            else if(text.charAt(i) == 'n'){
                ch[4]++;
            }
        }
        ch[2] /= 2;
        ch[3] /= 2;
        int min = ch[0];

        for(int i = 1; i < 5; i++){
            min = Math.min(min, ch[i]);
        }
        return min;
    }
}