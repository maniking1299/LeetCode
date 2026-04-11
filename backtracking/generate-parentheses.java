class Solution {
    public List<String> generateParenthesis(int n) {

        // TC->O(4^n/sqrt(n))
        // SC->O(n)

        String s = "";
        ArrayList<String> res = new ArrayList<>();
        int open=0;
        int close = 0;

        solve(s,n,open,close,res);

        return res;        

    }

    private void solve(String s ,int n, int open , int close , ArrayList<String>result){
        if(open == n && close == n){
            result.add(s);
            return;
        }

        if(open<n){
           solve(s+"(",n,open+1,close,result);
        }
        if(close<open){
           solve( s+")",n,open,close+1,result);
        }



    }
}