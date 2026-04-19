class Solution {
    public long subArrayRanges(int[] nums) {

        // Find Subarray MIN
           int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];

        Stack<Integer> stack = new Stack<>();

       
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] > nums[i]) {
                stack.pop();
            }
            left[i] = stack.isEmpty() ? i + 1 : i - stack.peek();
            stack.push(i);
        }

        stack.clear();

        
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && nums[stack.peek()] >= nums[i]) {
                stack.pop();
            }
            right[i] = stack.isEmpty() ? n - i : stack.peek() - i;
            stack.push(i);
        }

        long minsum = 0;

        for (int i = 0; i < n; i++) {
            long x = (long)nums[i] * left[i] * right[i];
            minsum = (minsum + x) ;
        }

        // find sub array max
        int[] leftmax = new int[n];
        int[] rightmax = new int[n];

        Stack<Integer> stackmax = new Stack<>();

     
        for (int i = 0; i < n; i++) {
            while (!stackmax.isEmpty() && nums[stackmax.peek()] < nums[i]) {
                stackmax.pop();
            }
            leftmax[i] = stackmax.isEmpty() ? i + 1 : i - stackmax.peek();
            stackmax.push(i);
        }

        stackmax.clear();

      
        for (int i = n - 1; i >= 0; i--) {
            while (!stackmax.isEmpty() && nums[stackmax.peek()] <= nums[i]) {
                stackmax.pop();
            }
            rightmax[i] = stackmax.isEmpty() ? n - i : stackmax.peek() - i;
            stackmax.push(i);
        }

        long maxsum = 0;

        for (int i = 0; i < n; i++) {
            long x = (long)nums[i] * leftmax[i] * rightmax[i];
            maxsum = (maxsum + x) ;
        }

        return maxsum-minsum;

    }
}