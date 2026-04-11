class Solution {
    public int tribonacci(int n) {
    
    ///////////////////Optmized///////////////
    // TC->O(N)
    // SC->O(1)

    if (n == 0) return 0;
    if (n == 1 || n == 2) return 1;

    int a = 0,b=1,c=1;
    
    for(int i=3; i<=n ;i++){
        int next = a+b+c;
        a = b;
        b = c;
        c = next;
    }
    return c;



////////////////////////////////////////////////////////////////
        // TC ->O(N)
        // SC ->O(N)
     /*  if (n == 0) return 0;
       if (n == 1 || n == 2) return 1;
        int dp[] = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;

        for(int i=3 ;i<=n ;i++){
            dp[i] = dp[i-1]+dp[i-2]+dp[i-3];
        }
        return dp[n]; */
    }
}