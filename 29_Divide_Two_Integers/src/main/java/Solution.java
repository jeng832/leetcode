class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == 0) return 0;
        if (dividend == divisor) return 1;
        if (divisor == 1) return dividend;

        boolean isNegative = !(dividend < 0 && divisor < 0) && ((dividend < 0) || (divisor < 0));
        if (!(dividend < 0 && divisor < 0)) {
            dividend = Math.abs(dividend);
            divisor = Math.abs(divisor);
        }

        int quotient = 0;
        while (dividend >= divisor || ((dividend < 0 && divisor < 0) && dividend <= divisor)) {
            if (quotient == Integer.MAX_VALUE) return Integer.MAX_VALUE;
            dividend -= divisor;
            quotient++;
        }

        return isNegative ? (-quotient) : quotient;
    }
}