class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {

            //TC->O(2^n*n)
            //SC->O(2^n*n)

        Arrays.sort(nums);
         List<List<Integer>> res =new ArrayList<List<Integer>>(); 
        
        recur(nums,0,new ArrayList<Integer>(),res);
        return res;
    }

     private static void recur(int[] nums, int i ,List<Integer> curr , List<List<Integer>> res){
        
        if(i == nums.length){
           res.add(new ArrayList<>(curr));
            return;
        }
         curr.add(nums[i]);
       // Add the element
        recur(nums,i+1,curr,res);
       // Undo the curr
        curr.remove(curr.size()-1);

       //Skip all the duplicates in one go
        while(i+1 < nums.length && nums[i] == nums[i+1]){
            i++;
        }
       // Skip the element
        recur(nums,i+1,curr,res);
    }
}