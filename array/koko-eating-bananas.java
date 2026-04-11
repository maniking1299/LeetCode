class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        // TC ->O(N*logN)
        // SC ->O(1)

        int low =1;
        int high =0;
       
        for(int i:piles){
            high = Math.max(high , i);
        }

        while(low < high){
           int mid = low+(high-low)/2;
             int k = 0;
            for(int i=0 ;i<piles.length ;i++){
                int celing = (piles[i]+mid-1)/mid;
                 k += celing;
            }
            if(k <= h){
                high = mid;
            }else{
                low = mid+1;
            }
        }

        return high;

    }

}