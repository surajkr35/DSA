class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                board[i][j] = '.';
            }
        }

        place(board, 0, ans);

        return ans;
    }
    private boolean safe(char[][] board, int row, int col){
        for(int i = row - 1; i >= 0; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        
        for(int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        for(int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        return true;
    }

    private void place(char[][] board, int row, List<List<String>> ans){
        if(row == board.length){
            List<String> str = new ArrayList<>();

            for(char[] ch : board){
                str.add(new String(ch));
            }

            ans.add(str);
            return;
        }

        for(int i = 0; i < board.length; i++){
            if(safe(board, row, i)){
                board[row][i] = 'Q';
                place(board, row + 1, ans);

                board[row][i] = '.';
            }
            
        }
    }
}