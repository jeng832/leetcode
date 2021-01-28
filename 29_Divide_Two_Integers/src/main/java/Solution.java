class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == 0) return 0;
        if (dividend == divisor) return 1;
        if (divisor == 1) return dividend;
        if (dividend == Integer.MAX_VALUE && divisor == 1) return Integer.MAX_VALUE;
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;

        long longDividend = dividend;
        long longDivisor = divisor;

        boolean isNegative = !(dividend < 0 && divisor < 0) && ((dividend < 0) || (divisor < 0));

        longDividend = Math.abs(longDividend);
        longDivisor = Math.abs(longDivisor);



        int quotient = 0;
        while (longDividend >= longDivisor) {

                longDividend -= longDivisor;
                quotient++;

        }

        return isNegative ? (-quotient) : quotient;
    }
}