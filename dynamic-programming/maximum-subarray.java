class Solution {
    // TC - O(N)
    // SC -O(1)

    // Pattern -> Kadane Algo
    
    public int maxSubArray(int[] nums) {
                int maxSum = nums[0];
                int sum =0;

                for(int i:nums){
                    sum +=i;
                    maxSum = Math.max(sum,maxSum);

                    if(sum <0){
                        sum = 0;
                    }
                }
          return maxSum;
    }
}