class Solution {
    public int subsetXORSum(int[] nums) {
        //TC->O(2^N)
        //SC->O(N)
        int ans = Xor(nums,0,0);
        return ans;
    }
    private static int Xor(int[] nums , int i , int ans){
        if(i == nums.length){
            return ans;
        }

        // include                           // Exclude
       return  Xor(nums,i+1,ans^nums[i])+ Xor(nums,i+1,ans);
       
       
    }
}