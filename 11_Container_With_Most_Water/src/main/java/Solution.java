class Solution {
    public int maxArea(int[] height) {
        int maxVolume = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i; j < height.length; j++) {
                int volume = (j - i) * ((height[i] < height[j]) ? height[i] : height[j]);
                if (volume > maxVolume) {
                    maxVolume = volume;
                }
            }
        }
        return maxVolume;
    }
}