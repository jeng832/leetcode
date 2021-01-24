import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        if (nums.length <= 3) return Collections.emptyList();
        Arrays.sort(nums);
        if (nums.length == 4 && nums[0] + nums[1] + nums[2] + nums[3] == target) {
            return Arrays.asList(Arrays.asList(nums[0], nums[1], nums[2], nums[3]));
        }

        List<List<Integer>> threeSum = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int[] subNums = new int[nums.length - 1];
            int index = 0;
            for (int j = 0; j < nums.length; j++) {
                if (i == j) continue;
                subNums[index++] = nums[j];
            }
            List<List<Integer>> subThreeSum = threeSum(subNums, target - nums[i]);
            for (List<Integer> sum : subThreeSum) {
                sum.add(nums[i]);
                sum.sort(Integer::compareTo);
            }
            threeSum.addAll(subThreeSum);

        }
        return threeSum.stream().distinct().collect(Collectors.toList());
    }

    private List<List<Integer>> threeSum(int[] nums, int target) {
        List<List<Integer>> ret = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int low = i + 1;
            int high = nums.length - 1;
            while (low < high) {
                if (nums[low] + nums[high] + nums[i] == target) {
                    ret.add(new ArrayList(Arrays.asList(nums[low], nums[i], nums[high])));
                    while (low + 1 < nums.length && nums[low] == nums[low + 1]) low++;
                    while (high - 1 >= 0 && nums[high] == nums[high - 1]) high--;
                    low++;
                    high--;
                } else if (nums[low] + nums[high] + nums[i] < target) {
                    low++;
                } else {
                    high--;
                }
            }
        }
        return ret;
    }
}