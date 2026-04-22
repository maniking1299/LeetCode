class Solution {
    public int maximalRectangle(char[][] matrix) {
        // TC->O(rows*cols)
        // SC->O(cols)
        int currRow[] = new int[matrix[0].length];
        int maxRect = 0;

        for(int i=0 ;i<matrix.length ;i++){
            for(int j=0 ;j<matrix[0].length ;j++){
                if(matrix[i][j] == '1'){
                    currRow[j] +=1;
                }else{
                    currRow[j] = 0;
                }
            }
            maxRect = Math.max(maxRect, maxHistogram(currRow));
        }
        return maxRect;
    }
     public int maxHistogram(int[] heights) {
   
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