class Solution {
    public boolean canJump(int[] nums) {
        return reachable(nums, nums.length - 1);
    }

    private boolean reachable(int[] nums, int to) {
        if (to == 0) return true;
        int distance = 1;
        for (int i = to - 1; i >= 0; i--) {
            if (nums[i] >= distance) {
                return reachable(nums, i);
            }
            distance++;
        }
        return false;
    }
}