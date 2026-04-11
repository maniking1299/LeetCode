class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int [] nextGtr = new int[nums2.length];
        int [] ans = new int[nums1.length];

        // TC->O(N)
        // SC->O(N)

        Stack<Integer> stack = new Stack<>();

        for(int i=nums2.length-1 ; i>=0 ;i--){
            int ele = nums2[i];

            // If stact is empty
            if(stack.isEmpty()){
                nextGtr[i] =-1;
                stack.push(ele);
                continue;
            }

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

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < nums2.length; i++) {
            map.put(nums2[i], nextGtr[i]);
        }

        for(int i = 0; i < nums1.length; i++) {
            ans[i] = map.get(nums1[i]);
        }

    return ans;
    }
}