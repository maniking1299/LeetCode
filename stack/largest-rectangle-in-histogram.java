class Solution {
    public int largestRectangleArea(int[] heights) {
        // TC->O(N)
        // SC->O(N)
        int h = heights.length;
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;

        for(int i=0 ;i<=h;i++){
            int currHeight = (i==h)?0:heights[i];
            
            while(!stack.isEmpty() && heights[stack.peek()]> currHeight){
                int height = heights[stack.pop()];
                int right = i;
                int left = stack.isEmpty()?-1:stack.peek();

                int width = right-left-1;

                maxArea = Math.max(maxArea,height*width);
            }
            stack.push(i);
        }
        return maxArea;
    }
}
        //////////////////////////////////////////
     /*   int lb[] = new int[h];
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
}*/