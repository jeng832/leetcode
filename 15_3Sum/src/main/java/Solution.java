import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {

    public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length < 3) return Collections.EMPTY_LIST;
        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int low = i + 1;
            int high = nums.length - 1;
            while(low < high) {
                if (nums[low] + nums[high] == (nums[i] * -1)) {
                    result.add(Arrays.asList( nums[i], nums[low], nums[high]));
                    while (low + 1 < nums.length && nums[low] == nums[low + 1]) low++;
                    while (high - 1 >= 0 && nums[high] == nums[high - 1]) high--;
                    low++;
                    high--;
                } else if (nums[low] + nums[high] < (nums[i] * -1)) {
                    low++;
                } else {
                    high--;
                }
            }
        }

        return result;
    }
}

