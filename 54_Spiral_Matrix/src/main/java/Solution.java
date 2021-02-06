import java.util.ArrayList;
import java.util.List;

class Solution {
    int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiral = new ArrayList<>();
        int side = 0;
        int currentRow = 0;
        int currentCol = 0;
        boolean[][] visited = new boolean[matrix.length][matrix[0].length];
        while(spiral.size() < matrix.length * matrix[0].length) {
            spiral.add(matrix[currentRow][currentCol]);
            visited[currentRow][currentCol] = true;
            if (isBlocked(visited, directions[side % 4], currentRow, currentCol)) side++;
            int[] direction = directions[side % 4];
            currentRow += direction[0];
            currentCol += direction[1];
        }

        return spiral;
    }

    private boolean isBlocked(boolean[][] visited, int[] dir, int row, int col) {
        int nextRow = row + dir[0];
        int nextCol = col + dir[1];
        if (nextRow < 0 || nextRow == visited.length) return true;
        if (nextCol < 0 || nextCol == visited[0].length) return true;
        if (visited[nextRow][nextCol]) return true;
        return false;
    }
}