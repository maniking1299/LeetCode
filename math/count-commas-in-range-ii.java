class Solution {
    public long countCommas(long n) {

        // TC ->O(N)
        // SC ->O(1)
        long base = 1000;
        long count = 0;

        while(base<=n){
            count = count + (n-base+1);
            base = base*1000;
        }
         return count;
    }
}