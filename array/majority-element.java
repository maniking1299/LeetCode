class Solution {
    public int majorityElement(int[] nums) {

        // TC-O(N) , SC-O(1)
        
        int majEle = -1;
        int count = 0;

        for(int i=0 ; i<nums.length ;i++ ){
            if(count == 0) majEle = nums[i];

            if(majEle == nums[i]) count++;
            else count--;
        }

        return majEle;
    }
}