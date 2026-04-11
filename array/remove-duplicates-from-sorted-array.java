class Solution {
    public int removeDuplicates(int[] nums) {

        // TC->O(N)
        // SC->O(1)
        
        int i =0;
        int j=i+1;

        while(j<nums.length){
            if(nums[i]==nums[j])j++;
            else{
                i++;
                nums[i]=nums[j];
                j++;
            }
        }

        return i+1;
    }
}