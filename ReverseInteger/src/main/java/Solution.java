class Solution {

    private Integer add(int a, int b) {
        if (Integer.MAX_VALUE - b < a) {
            return null;
        }
        return a + b;
    }

    public Integer multiply(int a, int b) {
        Integer ret = a;
        for (int i = 0; i < b - 1; i++) {
            ret = add(ret, a);
            if (ret == null) return null;
        }
        return ret;
    }
    public boolean checkOverflow(int ret, int weight, int digit) {
        Integer mul = multiply(weight, digit);
        if (mul == null) return true;
        if (Integer.MAX_VALUE - ret < mul) return true;
        return false;
    }

    public int reverse(int x) {
        boolean neg = false;
        if (x < 0) {
            neg = true;
            x = x * -1;
        }

        char[] str = ("" + x).toCharArray();
        int ret = 0;
        int weight = 1;
        for (int i = 0; i < str.length; i++) {
            Integer digit = new Integer(str[i] - '0');
            if (checkOverflow(ret, weight, digit)) return 0;
            ret += (weight * digit);
            weight *= 10;
        }
        return (neg ? ret * -1 : ret);
    }
}