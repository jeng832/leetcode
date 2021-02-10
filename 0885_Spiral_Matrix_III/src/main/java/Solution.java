class Solution {
    private int[][] directions = {{0, 1},{1, 0},{0, -1},{-1, 0}};
    public int[][] spiralMatrixIII(int R, int C, int r0, int c0) {
        int[][] locations = new int[R * C][2];
        int edgeLen = 0;
        int count = 0;
        int currentR = r0;
        int currentC = c0;
        int direction = 0;
        locations[count][0] = r0;
        locations[count][1] = c0;
        count++;
        while (count < R * C) {
            if (direction == 0 || direction == 2) edgeLen++;
            for (int i = 0; i < edgeLen; i++) {
                currentR += directions[direction][0];
                currentC += directions[direction][1];
                if (currentR >= 0 && currentR < R && currentC >= 0 && currentC < C) {
                    locations[count][0] = currentR;
                    locations[count][1] = currentC;
                    count++;
                }
            }
            direction = (direction + 1) % 4;
        }
        return locations;
    }

}