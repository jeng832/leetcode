import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    private void dfs(List<String> res, String str, int left, int right, String str1) {
        //System.out.println("str\t"+str+"\t left: "+left+" right: "+right+" str1: "+str1);
        if (left < 0 || left > right) return;

        if (left == 0 && right == 0) {
            res.add(str);
            return;
        }
        dfs(res, str + "(", left - 1, right, str1 + "+");
        dfs(res, str + ")", left, right - 1, str1 + "-");
    }

    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        dfs(res, "",n, n, "");
        return res;
    }
}