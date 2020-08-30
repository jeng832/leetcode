class Solution {
    public int searchInsert(int[] nums, int target) {
        if (target <= nums[0]) return 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == target) return i;
            if (nums[i] < target && target < nums[i + 1]) return i + 1;
        }
        if (nums[nums.length - 1] == target) return nums.length - 1;
        return nums.length;
    }
}