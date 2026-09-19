class Solution {

    public boolean exist(char[][] board, String word) {

        int m = board.length;
        int n = board[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (dfs(board, word, i, j, 0)) {
                    return true;
                }
            }
        }

        return false;
    }


    public boolean dfs(char[][] board, String word,
                       int row, int col, int index) {

        // পুরো word পাওয়া গেছে
        if (index == word.length()) {
            return true;
        }


        // boundary + character mismatch
        if (row < 0 || col < 0 ||
            row >= board.length || col >= board[0].length ||
            board[row][col] != word.charAt(index)) {

            return false;
        }


        // বর্তমান cell আবার ব্যবহার করা যাবে না
        char temp = board[row][col];
        board[row][col] = '#';


        // চারদিকে search
        boolean found =
                dfs(board, word, row + 1, col, index + 1) ||
                dfs(board, word, row - 1, col, index + 1) ||
                dfs(board, word, row, col + 1, index + 1) ||
                dfs(board, word, row, col - 1, index + 1);


        // BACKTRACK → আগের অবস্থায় ফেরত
        board[row][col] = temp;


        return found;
    }
}