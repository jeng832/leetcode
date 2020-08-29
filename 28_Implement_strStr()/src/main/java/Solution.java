class Solution {
    public int strStr(String haystack, String needle) {
        if (needle == null || needle.length() == 0) return 0;
        for (int i = 0; i < haystack.length(); i++) {
            boolean same = true;
            for (int j = 0; j < needle.length(); j++) {
                if (i + j >= haystack.length() || haystack.charAt(i + j) != needle.charAt(j)) {
                    same = false;
                    break;
                }
            }
            if (same) return i;
        }
        return -1;
    }
}