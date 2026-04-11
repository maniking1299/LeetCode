class Solution {
    public int countCommas(int n) {

        // Tc ->O(1)
        // Sc ->O(1)
        
        if(n<1000) return 0;
        else return n-999;
        
    }
}