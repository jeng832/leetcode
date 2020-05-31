public class Solution {

    private Boolean[][] mPalinMat;

    public boolean isPalin(char[] str, int start, int end) {
        if (start == end) return true;
        if (start > end) return false;
        if (mPalinMat[start][end] != null) return mPalinMat[start][end];
        if ((isPalin(str, start + 1, end - 1) && str[start] == str[end])
                || (start == end - 1 && str[start] == str[end])) {
            mPalinMat[start][end] = true;
        } else {
            mPalinMat[start][end] = false;
        }
        return mPalinMat[start][end];
    }
    public String longestPalindrome(String s) {
        if(s.length() == 1) return s;
        mPalinMat = new Boolean[s.length()][s.length()];
        char[] str = s.toCharArray();
        int maxLen = 0;
        String maxStr = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (isPalin(str, i, j)) {
                    int len = j - i + 1;
                    if (maxLen < len) {
                        maxLen = len;
                        maxStr = s.substring(i, j + 1);
                    }
                }
            }
        }
        return maxStr;
    }
}
