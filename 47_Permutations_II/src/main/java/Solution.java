import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        if (nums.length == 1) return Arrays.asList(Arrays.asList(nums[0]));
        Set<List<Integer>> permutations = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            List<Integer> permutation = new ArrayList<>();
            permutation.add(i);
            dfs(nums, permutation, permutations);
        }

        return new ArrayList<>(permutations);

    }

    private void dfs(int[] nums, List<Integer> permutation, Set<List<Integer>> permutations) {
        // System.out.println("permutation: " + permutation + ", permutations: " + permutations);
        if (permutation.size() == nums.length) {
            permutations.add(calculateValues(nums, permutation));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (permutation.contains(i)) continue;
            List<Integer> list = new ArrayList<>(permutation);
            list.add(i);
            dfs(nums, list, permutations);
        }
    }

    private List<Integer> calculateValues(int[] nums, List<Integer> perm) {
        return perm.stream().map(elem -> nums[elem]).collect(Collectors.toList());
    }
}