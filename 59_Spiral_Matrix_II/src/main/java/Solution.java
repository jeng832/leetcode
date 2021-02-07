class Solution {
    int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int col = 0;
        int row = 0;
        int dir = 0;
        int[] direction = directions[dir];
        for (int i = 1; i <= n*n ; i++) {
            matrix[row][col] = i;
            if (!isAvailable(matrix, row + direction[0], col + direction[1])) {
                direction = directions[(++dir) % 4];
            }
            row += direction[0];
            col += direction[1];
        }

        return matrix;
    }

    private boolean isAvailable(int[][] matrix, int row, int col) {
        if (row < 0 || row == matrix.length) return false;
        if (col < 0 || col == matrix[0].length) return false;
        return matrix[row][col] == 0;
    }
}