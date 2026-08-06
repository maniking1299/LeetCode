class Solution {
    public int smallestNumber(int n, int t) {
        int pd = prod(n);
    
        if(pd%t == 0){
            return n;
        }

      return  smallestNumber(n+1 ,t);
    }

    public int prod(int n){
        int prod = 1;
        while(n>0){
            int a = n%10;
            prod *= a;
            n = n/10;
        }

        return prod;
    }
}