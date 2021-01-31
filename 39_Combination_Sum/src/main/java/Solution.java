import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if (candidates.length == 1 && candidates[0] == target) return Arrays.asList(Arrays.asList(candidates[0]));

        Set<List<Integer>> combinations = new HashSet<>();
        for (int i = 0; i < candidates.length; i++) {
            List<Integer> combination = new ArrayList<>();
            combination.add(candidates[i]);
            dfs(candidates, target, combination, combinations);

        }
        return new ArrayList<>(combinations);
    }

    private void dfs(int[] candidates, int target, List<Integer> combination, Set<List<Integer>> combinations) {
        if (sumOf(combination) == target) {
            combination.sort(Integer::compareTo);
            combinations.add(combination);
            return;
        }
        if (sumOf(combination) > target) return;

        for (int i = 0; i < candidates.length; i++) {
            List<Integer> newCombination = new ArrayList<>(combination);
            newCombination.add(candidates[i]);
            dfs(candidates, target, newCombination, combinations);
        }
    }

    private int sumOf(List<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }
}