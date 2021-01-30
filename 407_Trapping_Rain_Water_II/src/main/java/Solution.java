import java.util.Arrays;

class Solution {
    public int trapRainWater(int[][] heightMap) {
        if (heightMap.length < 3 || heightMap[0].length < 3) return 0;

        int[][] water = new int[heightMap.length][heightMap[0].length];
        int sum = 0;
        for (int i = 1; i < heightMap.length - 1; i++) {
            int[] height = heightMap[i];
            int[] left = new int[height.length];
            int[] right = new int[height.length];

            int max = 0;
            for (int j = 0; j < height.length; j++) {
                max = Math.max(max, height[j]);
                left[j] = max;
            }

            max = 0;
            for (int j = height.length - 1; j >= 0 ; j--) {
                max = Math.max(max, height[j]);
                right[j] = max;
            }
            
            for (int j = 0; j < height.length; j++) {
                water[i][j] = Math.min(left[j], right[j]);
            }
        }


        for (int i = 0; i < heightMap[0].length; i++) {
            int[] up = new int[heightMap.length];
            int[] down = new int[heightMap.length];
            int max = 0;
            for (int j = 0; j < heightMap.length; j++) {
                max = Math.max(max, heightMap[j][i]);
                up[j] = max;
            }

            max = 0;
            for (int j = heightMap.length - 1; j >= 0; j--) {
                max = Math.max(max, heightMap[j][i]);
                down[j] = max;
            }

            for (int j = 1; j < heightMap.length - 1; j++) {
                water[j][i] = Math.min(Math.min(up[j], down[j]), water[j][i]);
            }
            
        }

        for (int i = 1; i < water.length - 1; i++) {
            for (int j = 1; j < water[0].length - 1; j++) {
                sum += (water[i][j] - heightMap[i][j]);
            }
        }
        return sum;
    }

}