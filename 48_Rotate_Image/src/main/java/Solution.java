import java.util.Arrays;

class Solution {
    private int[][] directions = {{1, 0}, {0, -1}, {-1, 0}, {0, 1}};

    public void rotate(int[][] matrix) {
        if (matrix.length == 1) return;

        int[] temp = Arrays.copyOf(matrix[0], matrix.length);
        int dir = 0;
        for (int i = 0; i < matrix.length / 2; i++) {
            int length = matrix.length - (i * 2);
            int col = i;
            int row = matrix.length - i;
            int nextCol = matrix.length - i;
            int nextRow = row;
            while (col != nextCol && row != nextRow) {
                //dir이 짝수이면 col 만 변화, 홀수 이면 row만 변화


            }

        }
    }
}