class Solution {
    public void nextPermutation(int[] nums) {
            // TC -> O(N)
            // SC -> O(1)
            int n = nums.length-1;
            int pvt = -1;

            // Find pvt
            for(int i=n-1 ; i>=0 ;i--){
                if(nums[i]<nums[i+1]){
                    pvt = i;
                    break;
                }
            }

            // If pvt found
            if(pvt !=-1){
                // Find element greater than pvt and swap .
                for(int i =n ; i>=0 ;i--){
                    if(nums[i]>nums[pvt]){
                        swap(nums , i ,pvt);
                        break;
                    }
                }
            }
            // If pvt not found means it is in decending order just reverse it. 
            // reverse the array after the pvt index.
            reverse(nums,pvt+1);
        }

        public void swap(int[] nums,int i ,int pvt){
            int temp = nums[i];
            nums[i] = nums[pvt];
            nums[pvt] = temp;
        }

        public void reverse(int[] nums , int pvt){
            int l = pvt;
            int r= nums.length-1;

            while(l<r){
                swap(nums,l++,r--);
            }
        }

  }


