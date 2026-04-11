class Solution {
    public int minAbsoluteDifference(int[] nums) {
        int min = Integer.MAX_VALUE;
        
        int last1 = -1;
        int last2 = -1;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                last1 = i;
                if(last2 != -1){
                    min = Math.min(min, Math.abs(last1 - last2));
                }
            }
            
            if(nums[i] == 2){
                last2 = i;
                if(last1 != -1){
                    min = Math.min(min, Math.abs(last1 - last2));
                }
            }
        }
        
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}