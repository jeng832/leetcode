import java.util.*;

class Solution {
    static class Position {
        int row;
        int col;
        private Position (int r, int c) {
            row = r;
            col = c;
        }
        public static Position of(int row, int col) {
            return new Position(row, col);
        }

        @Override
        public String toString() {
            return "Position(" + row + ", " + col +")";
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Position position = (Position) o;
            return row == position.row &&
                    col == position.col;
        }

        @Override
        public int hashCode() {
            return Objects.hash(row, col);
        }
    }

    private int[][] directions = {{1, 0}, {0, 1}};
    public int uniquePaths(int m, int n) {
        Set<List<Position>> paths = new HashSet<>();
        for (int i = 0; i < directions.length; i++) {
            List<Position> path = new ArrayList<>();
            Position start = Position.of(0, 0);
            path.add(start);
            dfs(m, n, start, path, paths);
        }
        return paths.size();
    }

    private void dfs(int rowSize, int colSize, Position pos, List<Position> path, Set<List<Position>> paths) {
        // System.out.println("position: " + pos + ", path: " + path + ", paths: " + paths);
        if (pos.row == rowSize - 1 && pos.col == colSize - 1) {
            paths.add(path);
            return;
        }

        for (int i = 0; i < directions.length; i++) {
            if (i == 0 && pos.row == rowSize - 1) continue;
            if (i == 1 && pos.col == colSize - 1) continue;
            Position newPosition = Position.of(pos.row + directions[i][0], pos.col + directions[i][1]);
            List<Position> newPath = new ArrayList<>(path);
            newPath.add(newPosition);
            dfs(rowSize, colSize, newPosition, newPath, paths);
        }
    }
}