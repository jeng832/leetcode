import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        if (candidates.length == 1 && candidates[0] == target) return Arrays.asList(Arrays.asList(candidates[0]));
        if (candidates.length == 1 && candidates[0] != target) return Collections.EMPTY_LIST;

        Set<List<Integer>> combinations = new HashSet<>();
        for (int i = 0; i < candidates.length; i++) {
            List<Integer> indexCombination = new ArrayList<>();
            indexCombination.add(i);
            dfs(candidates, target, indexCombination, combinations);

        }
        return new ArrayList<>(combinations);

    }

    private void dfs(int[] candidates, int target, List<Integer> indexCombination, Set<List<Integer>> combinations) {
        System.out.println("candidates: "+ Arrays.toString(candidates) + ", target: " + target + ", index: " + indexCombination + ", combinations: " + combinations);
        if (sumOf(indexCombination, candidates) == target) {
            combinations.add(indexCombination.stream().map(index -> candidates[index]).sorted().collect(Collectors.toList()));
            return;
        }

        if (sumOf(indexCombination, candidates) > target) {
            return;
        }

        for (int i = 0; i < candidates.length; i++) {
            if (indexCombination.contains(i)) continue;
            List<Integer> list = new ArrayList<>(indexCombination);
            list.add(i);
            dfs(candidates, target, list, combinations);
        }
    }

    private int sumOf(List<Integer> index, int[] candidates) {
        int sum = 0;

        for (int i = 0; i < index.size(); i++) {
            sum += candidates[index.get(i)];
        }

        return sum;
    }
}