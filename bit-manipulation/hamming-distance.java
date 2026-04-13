class Solution {
    public int hammingDistance(int x, int y) {
        // TC->O(bits)
        // SC->O(1)
        int diff= x^y;
        int distance=0;
        while(diff!=0){
           distance += (diff&1);

           diff = diff>>1;
        }
        return distance;
    }
    
}