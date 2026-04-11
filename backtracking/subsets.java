class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        // TC->O(2^n * n)
        // SC->O(2^n * n)

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
        // Left Side Add
        recur(nums,i+1,curr,res);
        //Undo the curr subset
        curr.remove(curr.size()-1);
        // Right side Skip
        recur(nums,i+1,curr,res);
    }
}