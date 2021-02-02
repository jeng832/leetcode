import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        if (nums.length == 1) return Arrays.asList(Arrays.asList(nums[0]));
        List<List<Integer>> permutations = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            List<Integer> list = new ArrayList<>();
            list.add(nums[i]);
            dfs(nums, list, permutations);
        }
        return permutations;
    }

    private void dfs(int[] nums, List<Integer> list, List<List<Integer>> permutations) {
        if (list.size() == nums.length) {
            permutations.add(list);
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (list.contains(nums[i])) continue;
            List<Integer> curr = new ArrayList<>(list);
            curr.add(nums[i]);
            dfs(nums, curr, permutations);
        }
    }
}