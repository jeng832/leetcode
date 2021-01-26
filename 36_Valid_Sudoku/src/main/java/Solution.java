class Solution {
    private final int BLOCK = 0;
    private final int ROW = 1;
    private final int COL = 2;
    private boolean[][][] valid = new boolean[3][9][9];

    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == '.') continue;
                int blockNum = getBlockNum(i, j);
                int index = board[i][j] - '0' - 1;
                if (valid[BLOCK][blockNum][index]) return false;
                valid[BLOCK][blockNum][index] = true;
                if (valid[ROW][i][index]) return false;
                valid[ROW][i][index] = true;
                if (valid[COL][j][index]) return false;
                valid[COL][j][index] = true;
            }
        }
        return true;
    }

    private int getBlockNum(int row, int col) {
        return (row / 3) * 3 + (col / 3);
    }
}