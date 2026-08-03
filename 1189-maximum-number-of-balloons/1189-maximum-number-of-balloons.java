class Solution {
    public int maxNumberOfBalloons(String text) {
        int n = text.length();
        char[] freq = new char[5];

        for(char ch : text.toCharArray()){
            if(ch == 'b'){
                freq[0]++;
            }
            else if(ch == 'a'){
                freq[1]++;
            }
            else if(ch == 'l'){
                freq[2]++;
            }
            else if(ch == 'o'){
                freq[3]++;
            }
            else if(ch == 'n'){
                freq[4]++;
            }
        }
        freq[2] /= 2;
        freq[3] /= 2;
        int min = freq[0];

        for(int i = 1; i < 5; i++){
            min = Math.min(min, freq[i]);
        }
        return min;
    }
}