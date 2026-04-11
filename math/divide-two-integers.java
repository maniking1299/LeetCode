class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==Integer.MIN_VALUE && divisor==-1){
            return Integer.MAX_VALUE;
        }
        // If any one negative then negative;
        boolean isNegative = dividend<0 ^ divisor<0;
        dividend= Math.abs(dividend);
        divisor = Math.abs(divisor);
        int quotient = 0;
        while(dividend-divisor >= 0){
            int currDivisor = divisor;
            int currQuotient = 1;

            while(dividend-(currDivisor<<1)>=0){
                currDivisor = currDivisor<<1;
                currQuotient = currQuotient<<1;
            }
            quotient += currQuotient;
            dividend -= currDivisor;
        }

        return isNegative? -quotient: quotient;
    }
}
