class Solution {
    public int longestOnes(int[] nums, int k) {
        //TC-> O(N)
        //SC-> O(1)
        int start = 0;
        int max_1 = 0;
        int zerosCount = 0;

        for(int end = 0 ;end<nums.length ;end++){
            if(nums[end] == 0){
                zerosCount++;
            }

            while(zerosCount > k){
                if(nums[start]==0){
                    zerosCount--;
                }
                start++;
            }

            max_1 = Math.max(max_1 , end-start+1);
        }

        return max_1;
    }
}