class Solution {
    public void solveSudoku(char[][] board) {

        //TC -> O(9^n^2);
        //SC -> O(n);
        solve(board);
    }

    public boolean solve(char[][] board) {
        int n = board.length;

        int row = -1;
        int col = -1;
        boolean emptyLeft = false;

        // Find empty cell
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == '.') {
                    row = i;
                    col = j;
                    emptyLeft = true;
                    break;
                }
            }
            if (emptyLeft) break;
        }

        // No empty cell → solved
        if (emptyLeft == false) return true;

        // Try numbers
        for (char num = '1'; num <= '9'; num++) {
            if (isSafe(board, row, col, num)) {
                board[row][col] = num;

                if (solve(board)) return true;

                // Backtrack
                board[row][col] = '.';
            }
        }

        return false;
    }

    public boolean isSafe(char[][] board, int row, int col, char num) {

        // Check row
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == num) return false;
        }

        // Check column
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == num) return false;
        }

        // Check 3x3 box
        int sqrt = (int) Math.sqrt(board.length);
        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;

        for (int r = rowStart; r < rowStart + sqrt; r++) {
            for (int c = colStart; c < colStart + sqrt; c++) {
                if (board[r][c] == num) return false;
            }
        }

        return true;
    }
}