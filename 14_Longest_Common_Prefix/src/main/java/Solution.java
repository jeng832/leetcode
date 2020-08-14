import java.util.Arrays;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        int shortestLen = Arrays.stream(strs).map(s -> s.length()).min(Integer::compareTo).get();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < shortestLen; i++) {
            char current = strs[0].charAt(i);
            for (String str : strs) {
                if (str.charAt(i) != current) {
                    return sb.toString();
                }
            }
            sb.append(current);
        }

        return sb.toString();
    }
}