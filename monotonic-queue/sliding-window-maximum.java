class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        // TC->O(N)
        // SC->O(N)
        Deque<Integer> q = new ArrayDeque<>();
        int[] ans = new int[nums.length-k+1];

        for(int i=0 ; i<k ; i++){
            while(!q.isEmpty() && nums[q.peekLast()]<=nums[i]){
                q.pollLast();
            }
            q.offerLast(i);
        }

        ans[0] = nums[q.peekFirst()];

        for(int i=k ;i<nums.length ;i++){

            if(q.peekFirst() <= i-k){
                q.pollFirst();
            }

            while(!q.isEmpty() && nums[q.peekLast()]<=nums[i]){
                q.pollLast();
            }

            q.offerLast(i);

            ans[i-k+1] = nums[q.peekFirst()];
        }

        return ans;
    }
}