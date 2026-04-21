class Solution {
    public int largestRectangleArea(int[] heights) {
        int h = heights.length;
        int lb[] = new int[h];
        int rb[] = new int[h];

        Stack<Integer> stack = new Stack<>();

        for(int i=0 ;i<h ;i++){
            while(!stack.isEmpty() && heights[stack.peek()] > heights[i]){
                stack.pop();
            }
            lb[i] = stack.isEmpty()?-1:stack.peek();
            stack.push(i);
        }
        stack.clear();
        for(int i=h-1 ;i>=0 ;i--){
            while(!stack.isEmpty() && heights[stack.peek()] >= heights[i]){
                stack.pop();
            }
            rb[i] = stack.isEmpty()?h:stack.peek();
            stack.push(i);
        }

        int maxArea = -1;

        for(int i=0 ;i<h ;i++){
            maxArea  = Math.max(maxArea , (rb[i]-lb[i]-1)*heights[i]);
        }

        return maxArea;
    }
}