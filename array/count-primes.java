class Solution {
    public int countPrimes(int n) {
        // TC->O(n log log n)
        // SC->O(n)
        if(n<2){
            return 0;
        }
        
        boolean isPrime[] = new boolean[n+1];
        Arrays.fill(isPrime,true);

        isPrime[0] =false;
        isPrime[1] = false;
        
        for(int i=2 ;i*i<n ;i++){
            if(isPrime[i]){
                for(int j=i*i ;j<n ;j+=i){
                    isPrime[j] = false;
                }
            }
        }
        int count=0;
        for(int i=2;i<n ;i++){
            if(isPrime[i]){
                count++;
            }
        }

        return count;
        
    }
}