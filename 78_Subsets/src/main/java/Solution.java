import java.util.*;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        Set<List<Integer>> subSets = new HashSet<>();
        subSets.add(Collections.EMPTY_LIST);

        for (int i = 0; i < nums.length; i++) {
            List<Integer> list = new ArrayList<>();
            list.add(nums[i]);
            dfs(nums, i, list, subSets);
        }

        return new ArrayList<>(subSets);
    }

    private void dfs(int[] nums, int index, List<Integer> subSet, Set<List<Integer>> subSets) {
        //System.out.println("index: " + index + ", subSet: " + subSet + ", subSets: " + subSets);
        subSets.add(subSet);

        for (int i = index + 1; i < nums.length; i++) {
            List<Integer> list = new ArrayList<>(subSet);
            list.add(nums[i]);
            dfs(nums, i, list, subSets);
        }

    }
}