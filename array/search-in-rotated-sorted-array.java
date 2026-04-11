class Solution {
    public int search(int[] nums, int target) {

        //TC-O(log N)
        //SC-O(1)
        
        return modiBinarySrc(nums,target,0,nums.length-1);

    }

    private static int modiBinarySrc(int nums[] ,int target ,  int si,int ei){

            if(si>ei) return -1;

            int mid = si+(ei-si)/2;
            if(nums[mid] == target) return mid;

            // left part is sorted
            if(nums[mid] >= nums[si]){

                // search in left part 
                if(nums[mid]>=target && nums[si]<=target)
                    return modiBinarySrc(nums,target,si,mid-1);
                else
                    return modiBinarySrc(nums,target,mid+1,ei);    
            }else{
                // right part is sorted

                // search in right part

                if(nums[mid]<=target && nums[ei]>=target)
                    return modiBinarySrc(nums,target,mid+1,ei);
                else 
                   return modiBinarySrc(nums,target,si,mid-1);   
            }
    } 
}