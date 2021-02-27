import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    private int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    public boolean exist(char[][] board, String word) {
        List<int[]> starts = getStartPoints(board, word);

        for (int[] start : starts) {
            List<int[]> path = new ArrayList<>();
            path.add(start);
            if (backtrack(board, word, path)) return true;
        }

        return false;
    }

    private boolean backtrack(char[][] board, String word, List<int[]> path) {
        String str = pathToStr(board, path);
        if (str.equals(word)) {
            return true;
        }

        for (int i = 0; i < directions.length; i++) {
            int[] last = path.get(path.size() - 1);
            int newRow = last[0] + directions[i][0];
            int newCol = last[1] + directions[i][1];
            int[] next = new int[] {newRow, newCol};
            if (newRow < 0 || newRow >= board.length || newCol < 0 || newCol >= board[0].length) continue;
            if (contain(path, next)) continue;
            List<int[]> newPath = new ArrayList<>(path);
            newPath.add(next);
            if (word.indexOf(pathToStr(board, newPath)) != 0) continue;
            if (backtrack(board, word, newPath)) return true;
        }
        return false;
    }

    private boolean contain(List<int[]> path, int[] next) {
        for (int[] loc : path) {
            if (Arrays.equals(loc, next)) return true;
        }
        return false;
    }

    private List<int[]> getStartPoints(char[][] board, String word) {
        List<int[]> starts = new ArrayList<>();
        char ch = word.charAt(0);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == ch) starts.add(new int[] {i, j});
            }
        }
        return starts;
    }

    private String pathToStr(char[][] board, List<int[]> path) {
        StringBuilder sb = new StringBuilder();
        for (int[] loc : path) {
            sb.append(board[loc[0]][loc[1]]);
        }
        return sb.toString();
    }
}