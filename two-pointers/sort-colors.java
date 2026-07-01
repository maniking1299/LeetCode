 class Solution {
    // TC -> O(N)
    // SC -> O(1)
    // Pattern -> Duch National flag
        public void sortColors(int[] nums) {
            int start = 0;
            int i = 0;
            int end = nums.length-1;

            while(i<=end){
               if(nums[i] == 0){
                   swap(nums,i,start);
                   i++;
                   start++;
               }else if(nums[i] == 2){
                   swap(nums,i,end);
                   end--;
               }else{
                   i++;
               }

            }


        }
        public void swap(int[] nums,int x , int y){
            if(nums[x] == nums[y])return;

            int temp = nums[x];
            nums[x] = nums[y];
            nums[y] = temp ;
        }
    }

