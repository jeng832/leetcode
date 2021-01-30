class Solution {
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0)  return new int[] {-1, -1};
        if (nums.length == 1 && nums[0] == target) return new int[] {0, 0};

        int[] targets = new int[] {-1, -1};
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            if (targets[0] == -1) {
                if (nums[low] == target) {
                    targets[0] = low;
                } else {
                    low++;
                }
            }
            if (targets[1] == -1) {
                if (nums[high] == target) {
                    targets[1] = high;
                } else {
                    high--;
                }
            }
            if (targets[0] != -1 && targets[1] != -1) return targets;
        }
        return targets;
    }
}