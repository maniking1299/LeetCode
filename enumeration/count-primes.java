class Solution {
    public int countPrimes(int n) {
        if(n==0 || n==1){
            return 0;
        }
        int count=0;
        for(int i=2 ; i<=n ;i++){
            int x = i;
            if((x&(x-1)) == (x-1)){
                count++;
            }
        }

        return count;
    }
}