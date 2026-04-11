class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
        int [] nextGtr = new int[nums.length];

        // TC->O(N)
        // SC->O(N)

        Stack<Integer> stack = new Stack<>();

        for(int i=nums.length-1 ;i>=0 ;i--){
            stack.push(nums[i]);
        }

        for(int i=nums.length-1 ; i>=0 ;i--){
            int ele = nums[i];
            // If Stack element is greater 
            if(stack.peek() > ele){
                nextGtr[i] = stack.peek();
                stack.push(ele);
                continue;
            }

            // If there is no greater element present
            while(!stack.isEmpty()&&stack.peek() <= ele){
                stack.pop();
            }

            // Stack either found greater or it is empty
            if(stack.isEmpty()){
                nextGtr[i] = -1;
            }else{
                nextGtr[i] = stack.peek();
            }

            stack.push(ele);
        }


    return nextGtr;
    }
}