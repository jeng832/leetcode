class Solution {
    private Integer[] hops;
    public int jump(int[] nums) {
        hops = new Integer[nums.length];
        checkHop(nums, 0, 0);
        return hops[hops.length - 1];
    }

    private void checkHop(int[] nums, int position, int hop) {
        if (position == nums.length - 1) {
            if (hops[position] == null) {
                hops[position] = hop;
            } else {
                hops[position] = Math.min(hops[position], hop);
            }
            return;
        }
        if (hops[position] != null && hops[position] <= hop) return;

        if (hops[position] == null) {
            hops[position] = hop;
        } else {
            hops[position] = Math.min(hops[position], hop);
        }
        int jump = nums[position];
        for (int i = 1; i <= jump && position + i < nums.length; i++) {
            checkHop(nums, position + i, hop + 1);
        }
    }
}