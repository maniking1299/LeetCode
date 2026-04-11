class Solution {
    // TC -> O(N*2^N)
    // SC -> O(N)
    List<List<String>> res = new ArrayList<>();
    int n;
    public List<List<String>> partition(String s) {
        n = s.length();
        recurr(s,0,new ArrayList<>());
        return res;
    }
    public boolean isPalindrome(String s , int start , int end){
        while(start < end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public void recurr(String s , int partIndex , List<String> curr){
        // Base Case;
        if(partIndex == n){
            res.add(new ArrayList<>(curr));
            return;
        }

        // Explore All possibility
        for(int end=partIndex ; end<n ; end++){
            // CHeck Palindrome
            if(isPalindrome(s,partIndex,end)){
                // add in curr
                // So substring() upperbound is exclusive so add end+1 to make inclusive.
                curr.add(s.substring(partIndex,end+1));
                // explore deep
                recurr(s,end+1,curr);
                // backtrack
                curr.remove(curr.size()-1);
            }
        }
    }
}