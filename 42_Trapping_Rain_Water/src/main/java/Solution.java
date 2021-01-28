class Solution {
    public int trap(int[] height) {
        // 1. for i= 0~height.length 최대 높이 측정
        // 2. for i= height.length~0 최대 높이 측정
        // 3. 두개의 높이 중 낮은 높이를 해당 칸의 빗물높이로 저장
        // 4. 저장된 높이를 모두 더하기
        if (height.length <= 2) return 0;
        int[] left = new int[height.length];
        int[] right = new int[height.length];
        int[] rain = new int[height.length];

        int max = 0;
        for (int i = 0; i < height.length; i++) {
            max = Math.max(max, height[i]);
            left[i] = max;
        }
        max = 0;
        for (int i = height.length - 1; i >= 0 ; i--) {
            max = Math.max(max, height[i]);
            right[i] = max;
        }

        int sum = 0;
        for (int i = 0; i < height.length; i++) {
            sum += Math.min(left[i], right[i]) - height[i];
        }
        return sum;
    }
}