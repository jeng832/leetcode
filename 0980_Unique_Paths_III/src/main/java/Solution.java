import java.util.*;

class Solution {

    private int[][] directions = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
    public int uniquePathsIII(int[][] grid) {
        Set<List<int[]>> paths = new HashSet<>();
        int[] starting = getStartingPoint(grid);
        int[] finish = getFinishPoint(grid);
        int count = countEmpty(grid);

        List<int[]> path = new ArrayList<>();
        path.add(starting);
        backTrack(grid, finish, count, path, paths);

        return paths.size();
    }

    private int countEmpty(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 0) count++;
            }
        }
        return count;
    }

    private int[] getFinishPoint(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2) return new int[] {i, j};
            }
        }
        return null;
    }

    private void backTrack(int[][] grid, int[] finish, int count, List<int[]> path, Set<List<int[]>> paths) {
        int[] last = path.get(path.size() - 1);
        //System.out.println("last: " + Arrays.toString(last) + ", path: " + getPath(path) + ", paths: " + getPaths(paths));
        if (last[0] == finish[0] && last[1] == finish[1]) {
            if (path.size() == count + 2) paths.add(path);
            return;
        }


        for (int i = 0; i < directions.length; i++) {
            int newRow = last[0] + directions[i][0];
            int newCol = last[1] + directions[i][1];
            if (!isValid(grid, newRow, newCol, path)) continue;
            List<int[]> newPath = new ArrayList<>(path);
            newPath.add(new int[] {newRow, newCol});
            backTrack(grid, finish, count, newPath, paths);
        }
    }

    private String getPath(List<int[]> path) {
        StringJoiner sj = new StringJoiner(", ");

        for (int i = 0; i < path.size(); i++) {
            int[] loc = path.get(i);
            sj.add(Arrays.toString(loc));
        }

        return sj.toString();
    }

    private String getPaths(Set<List<int[]>> paths) {
        StringJoiner sj = new StringJoiner(", ");
        for (List<int[]> path : paths) {
            sj.add(getPath(path));
        }

        return sj.toString();
    }

    private int[] getStartingPoint(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) return new int[] {i, j};
            }
        }
        return null;
    }

    private boolean isValid(int[][] grid, int row, int col, List<int[]> path) {
        if (col >= grid[0].length || row >= grid.length || col < 0 || row < 0) return false;
        if (grid[row][col] == -1 || grid[row][col] == 1) return false;
        if (contain(path, new int[] {row, col})) return false;
        return true;
    }

    private boolean contain(List<int[]> path, int[] loc) {
        for (int[] point : path) {
            if (Arrays.equals(point, loc)) return true;
        }
        return false;
    }
}