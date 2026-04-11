class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> set = new HashSet<>(wordDict);
        boolean dp[] = new boolean[s.length()+1];
        boolean visited[] = new boolean[s.length()+1];
       
        return solve(s,set,0,dp,visited);
    }
    public boolean solve(String s , Set<String> set , int i,boolean[] dp , boolean[] visited ){

            if(i==s.length())return true;   
        
        if(visited[i]){
            return dp[i];
        }else{
            for(int j=i+1 ;j<=s.length() ;j++){
                String str = s.substring(i,j);

                if(set.contains(str) && solve(s,set,j,dp,visited)){
                    dp[i] = true;
                    visited[i] = true;
                    return dp[i];
                }
              
            }
            dp[i] = false;
            visited[i] = true;

        }
            return dp[i];
    }
}