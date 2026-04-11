class Solution {
    public void sortColors(int[] nums) {
        // TC->O(N)
        // SC->O(1)
        int s = 0,mid = 0, end = nums.length-1;

        while(mid <= end){

            if(nums[mid]==0){
                swap(nums , s,mid);
                s++;
                mid++;
            }else if(nums[mid]==1){
                mid++;
            }else if(nums[mid]==2){
                swap(nums , end , mid);
                end--;
               
            }
        }

        
    }
    private static void swap(int nums[], int a , int b){
        if(nums[a]==nums[b]) return;
        
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}