class Solution {
    public boolean exist(char[][] board, String word) {
        int r = board.length;
        int c = board[0].length;

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(word.charAt(0) == board[i][j] && check(board, i, j, word, 0)){
                    return true;
                }
            }
        }
        return false;
    }
    private boolean check(char[][] board, int r, int c, String s, int i){
        if(i == s.length()){
            return true;
        }

        if(r < 0 || r >= board.length || c < 0 || c >= board[0].length || s.charAt(i) != board[r][c] || board[r][c] == 'X'){
            return false;
        }

        char temp = board[r][c];
        board[r][c] = 'X';

        boolean res = check(board, r + 1, c, s, i + 1) ||
                      check(board, r - 1, c, s, i + 1) ||
                      check(board, r, c + 1, s, i + 1) ||
                      check(board, r, c - 1, s, i + 1);

        board[r][c] = temp;

        return res;
    }
}