class Solution {
    public int pivotIndex(int[] nums) {
        
        // TC-O(N)
        // SC-O(1)

        int totalSum = 0;
        for(int i:nums){
            totalSum +=i;
        }

        int leftSum=0;
       

        for(int i=0 ;i<nums.length;i++){
          int rightSum= totalSum - leftSum-nums[i];

          if(rightSum == leftSum) return i;

          leftSum +=nums[i];
        }

        return -1;

    }
}
 ////////////////////////////////////////////////////////////////       
      /*  int ps[] = new int[nums.length];

        ps[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            ps[i] = ps[i - 1] + nums[i];
        }

         int  ls = 0;
        for(int i = 0 ; i<nums.length;i++){
            if(i>0){
                 ls = ps[i-1];
               
            }
            int rs = ps[nums.length-1] - ps[i];

            if(rs == ls)
                return i;

        }  

        return -1; */
