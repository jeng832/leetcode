import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    private int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    public List<String> findWords(char[][] board, String[] words) {
        List<String> existWords = new ArrayList<>();
        for (String word : words) {
            if (findWord(board, word)) existWords.add(word);
        }
        return existWords;
    }

    private boolean findWord(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] != word.charAt(0)) continue;
                List<int[]> locations = new ArrayList<>();
                locations.add(new int[] {i, j});
                if (backTrack(board, word, locations)) return true;
            }
        }
        return false;
    }

    private boolean backTrack(char[][] board, String word, List<int[]> locations) {
        if (location2Str(board, locations).equals(word)) return true;
        int[] last = locations.get(locations.size() - 1);

        for (int i = 0; i < directions.length; i++) {
            int[] direction = directions[i];
            int newRow = last[0] + direction[0];
            int newCol = last[1] + direction[1];
            if (newRow < 0 || newRow >= board.length || newCol < 0 || newCol >= board[0].length) continue;
            int[] next = new int[] {newRow, newCol};
            if (contain(locations, next)) continue;
            List<int[]> newLocations = new ArrayList<>(locations);
            newLocations.add(next);
            if (word.indexOf(location2Str(board, newLocations)) != 0) continue;
            if (backTrack(board, word, newLocations)) return true;
        }
        return false;
    }

    private boolean contain(List<int[]> locations, int[] next) {
        for (int[] loc : locations) {
            if (Arrays.equals(loc, next)) return true;
        }
        return false;
    }

    private String location2Str(char[][] board, List<int[]> locations) {
        StringBuilder sb = new StringBuilder();
        for (int[] loc : locations) {
            sb.append(board[loc[0]][loc[1]]);
        }
        return sb.toString();
    }
}