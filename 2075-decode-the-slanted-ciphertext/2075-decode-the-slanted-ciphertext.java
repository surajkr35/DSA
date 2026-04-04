class Solution {
    public String decodeCiphertext(String encodedText, int rows) {
        if (rows == 1) 
            return encodedText;
        
        int n = encodedText.length();
        int cols = n / rows;
        int i = 0, j = 0, k = 0;
        StringBuilder dec = new StringBuilder();
        
        while (k < n) {
            dec.append(encodedText.charAt(k));
            i++;
            if (i == rows) {
                i = 0;
                j++;
            }
            k = i * (cols + 1) + j;
        }
        
        while (dec.length() > 0 && dec.charAt(dec.length() - 1) == ' ') {
            dec.setLength(dec.length() - 1);
        }

        return dec.toString();
    }
}