class Solution {
    private void shift(int[] nums, int ori, int dest) {
        int temp = nums[ori];
        nums[ori] = nums[dest];
        nums[dest] = temp;
    }

    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) return 0;
        int backward = nums.length - 1;
        for (int i = 0; i <= backward; i++) {
            while (nums[i] == val) {
                shift(nums, i, backward);
                if (backward == 0 || i == backward) break;
                backward--;
            }
        }
        return (nums[backward] == val)? backward : backward + 1;
    }
}