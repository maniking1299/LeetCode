class Solution {
    public int sumSubarrayMins(int[] arr) {
        // TC->O(N)
        // SC->O(N)
         int n = arr.length;
        int[] left = new int[n];
        int[] right = new int[n];

        Stack<Integer> stack = new Stack<>();

        // LEFT-> strictly greater
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                stack.pop();
            }
            left[i] = stack.isEmpty() ? i + 1 : i - stack.peek();
            stack.push(i);
        }

        stack.clear();

        // RIGHT-> greater or equal
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            right[i] = stack.isEmpty() ? n - i : stack.peek() - i;
            stack.push(i);
        }

        int sum = 0;
        int MOD = 1_000_000_007;

        for (int i = 0; i < n; i++) {
            int x = arr[i] * left[i] * right[i];
            sum = (sum + x) % MOD;
        }

        return sum;
    
    }
}