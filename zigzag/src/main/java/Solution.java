public class Solution {
    private String Mat2Str(char[][] strMat) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strMat.length; i++) {
            for (int j = 0; j < strMat[0].length; j++) {
                if (strMat[i][j] == '\u0000') continue;
                sb.append(strMat[i][j]);
            }
        }
        return sb.toString();
    }
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;
        char[] str = s.toCharArray();
        char[][] retMat = new char[numRows][s.length()];
        int col = 0;
        int row = 0;
        boolean down = true;

        for (int i = 0; i < str.length; i++) {
            retMat[col][row] = str[i];

            if (col == numRows - 1) {
                if (down) {
                   row++;
                }
                down = false;
            } else if (col == 0) {
                if (!down) {
                    row++;
                }
                down = true;
            }
            col += (down ? 1 : -1);
        }

        return Mat2Str(retMat);
    }
}
