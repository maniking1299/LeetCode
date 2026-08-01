class Solution {
    public boolean predictTheWinner(int[] nums) {
        
        int n = nums.length;
        int totalSum = 0;
        for(int i:nums){
            totalSum += i;
        }

        int player_1 = solve(0,n-1,nums);
        int player_2 = totalSum - player_1 ;

        return player_1 >= player_2;
    }

    public int solve(int i, int j ,int [] nums){

        if(i>j){
            return 0;
        }
        if(i == j){
            return nums[i];
        }

        int take_i = nums[i]+Math.min(solve(i+2,j,nums) , solve(i+1,j-1,nums));

        int take_j = nums[j]+Math.min(solve(i+1,j-1,nums) , solve(i,j-2,nums));

        return Math.max(take_i ,take_j);
    }
}