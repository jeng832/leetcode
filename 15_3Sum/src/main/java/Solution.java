import java.util.*;
import java.util.stream.Collectors;

class Solution {

    public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length < 3) return Collections.EMPTY_LIST;
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            List<Integer> threeNums = new ArrayList<>();
            threeNums.add(i);
            dfs(nums, threeNums, set);
        }
        return new ArrayList<>(set);
    }

    private void dfs(int[] nums, List<Integer> threeNums, Set<List<Integer>> set) {
        //System.out.println("threeNums: " + threeNums + ", set: " + set);
        if (threeNums.size() == 3) {
            int sum = 0;
            for (Integer num : threeNums) {
                sum += nums[num];
            }
            if (sum == 0) {
                set.add(threeNums.stream().map(e -> nums[e]).sorted().collect(Collectors.toList()));
            }
            return;
        }

        int lastIdx = threeNums.size();
        int last = threeNums.get(lastIdx - 1);
        for (int i = last + 1; i < nums.length; i++) {
            if (threeNums.contains(i)) continue;
            List<Integer> sub = new ArrayList<>(threeNums);
            sub.add(i);
            dfs(nums, sub, set);
        }
    }
}

