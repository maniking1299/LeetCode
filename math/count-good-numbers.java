class Solution {
    public int countGoodNumbers(long n) {
       long mod = 1000000007L;
        long evenCount = (n+1)/2;
        long oddCount =n/2;

        long answer=myPow(5,evenCount,mod)*myPow(4,oddCount,mod)%mod;
        return (int)answer;
    }
    public static long myPow(long base, long exp,long mod) {

        long result= 1;
        while(exp!=0){
            if(exp%2 != 0){
                result = (result * base)%mod;
            }
            base = (base*base)%mod;
            exp = exp/2;
        }

        return result;
    }
}