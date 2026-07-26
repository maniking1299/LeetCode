class Solution {
    public int maximumProduct(int[] nums) {
      int i=0;
      int j=2;

      int maxProduct = Integer.MIN_VALUE;

      while(j<nums.length){
        int currProduct = nums[i]*nums[i+1]*nums[j];
        maxProduct = Math.max(currProduct,maxProduct);
        i++;
        j++;
      }

      return maxProduct;
    }
}