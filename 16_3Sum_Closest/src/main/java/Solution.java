import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        if (nums.length == 3) return nums[0] + nums[1] + nums[2];
        Arrays.sort(nums);
        int max = nums[nums.length - 1] + nums[nums.length - 2] + nums[nums.length - 3];
        int min = nums[0] + nums[1] + nums[2];
        int range = Math.max(Math.abs(max - target), Math.abs(target - min));

        for (int i = 0; i <= range; i++) {
            if (threeSum(nums, target + i)) return target + i;
            if (threeSum(nums, target - i)) return target - i;
        }
        return max;
    }

    private boolean threeSum(int[] nums, int num) {
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int low = i + 1;
            int high = nums.length - 1;
            while (low < high) {
                if (nums[i] + nums[low] + nums[high] == num) {
                    return true;
                } else if (nums[i] + nums[low] + nums[high] < num) {
                    low++;
                } else {
                    high--;
                }

            }
        }
        return false;
    }
}