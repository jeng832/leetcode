import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class Solution {
    private Map<Integer, Set<Integer>> blockCandidates;
    private Map<Integer, Set<Integer>> rowCandidates;
    private Map<Integer, Set<Integer>> columnCandidates;

    public Solution() {
        blockCandidates = new HashMap<>();
        rowCandidates = new HashMap<>();
        columnCandidates = new HashMap<>();
    }
    public void solveSudoku(char[][] board) {
        int emptyCount = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == '.') {
                    emptyCount++;
                    continue;
                }

                Integer value = board[i][j] - '0';
                int block = getBlockNumber(i, j);
                if (blockCandidates.containsKey(block)) {
                    blockCandidates.get(block).remove(value);
                } else {
                    HashSet<Integer> candidates = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
                    candidates.remove(value);
                    blockCandidates.put(block, candidates);
                }
                if (rowCandidates.containsKey(i)) {
                    rowCandidates.get(i).remove(value);
                } else {
                    HashSet<Integer> candidates = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
                    candidates.remove(value);
                    rowCandidates.put(i, candidates);
                }
                if (columnCandidates.containsKey(j)) {
                    columnCandidates.get(j).remove(value);
                } else {
                    HashSet<Integer> candidates = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
                    candidates.remove(value);
                    columnCandidates.put(j, candidates);
                }
            }
        }
        for (int i = 0; i < 9; i++) {
            if (!blockCandidates.containsKey(i)) blockCandidates.put(i, new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9)));
            if (!rowCandidates.containsKey(i)) rowCandidates.put(i, new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9)));
            if (!columnCandidates.containsKey(i)) columnCandidates.put(i, new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9)));
        }

        while (emptyCount > 0) {
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[0].length; j++) {
                    if (board[i][j] != '.') continue;

                    Set<Integer> candidate = getIntersection(blockCandidates.get(getBlockNumber(i, j)), rowCandidates.get(i), columnCandidates.get(j));

                    Integer[] candi = new Integer[candidate.size()];
                    candidate.toArray(candi);
                    if (candi.length == 1) {
                        board[i][j] = (char) ('0' + candi[0]);
                        Integer value = board[i][j] - '0';
                        blockCandidates.get(getBlockNumber(i, j)).remove(value);
                        rowCandidates.get(i).remove(value);
                        columnCandidates.get(j).remove(value);
                        emptyCount--;
                    }
                }
            }
        }
    }

    private int getBlockNumber(int row, int column) {
        return ((row / 3) * 3) + (column / 3);
    }

    private Set<Integer> getIntersection(Set<Integer> set1, Set<Integer> set2, Set<Integer> set3) {
        Set<Integer> intersection = new HashSet<>();
        Iterator<Integer> itr = set1.iterator();
        while (itr.hasNext()) {
            Integer value = itr.next();
            if (!set2.contains(value)) continue;
            if (!set3.contains(value)) continue;
            intersection.add(value);
        }
        return intersection;
//        return set1.stream().filter(elem -> !set2.contains(elem) || ! set3.contains(elem)).collect(
//                Collectors.toSet());
    }

}