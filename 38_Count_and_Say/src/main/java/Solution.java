class Solution {
    public String countAndSay(int n) {
        if (n == 1) return "1";
        String said = countAndSay(n - 1);
        if (said.length() == 1) return "1" + said;

        StringBuilder sb = new StringBuilder();
        char before = said.charAt(0);
        int same = 1;
        for (int i = 1; i < said.length(); i++) {
            char ch = said.charAt(i);
            if (ch == before) {
                same++;
                continue;
            }
            sb.append(same);
            sb.append(before);
            before = ch;
            same = 1;
        }
        sb.append(same);
        sb.append(before);
        return sb.toString();
    }
}