class Solution {
    public int lengthOfLastWord(String s) {
        String[] splitStrs = s.split(" ");
        return (splitStrs.length == 0) ? 0 : splitStrs[splitStrs.length - 1].length();
    }
}