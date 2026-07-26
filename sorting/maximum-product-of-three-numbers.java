class Solution {
    public int maximumProduct(int[] nums) {
      int i=0;
      int j=2;

      int maxProduct = -1001;

      while(j<nums.length){
        int currProduct = nums[i]*nums[i+1]*nums[j];
        maxProduct = Math.max(currProduct,maxProduct);
        i++;
        j++;
      }

      return maxProduct;
    }
}