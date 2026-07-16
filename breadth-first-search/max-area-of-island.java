class Solution {
    public int maxAreaOfIsland(int[][] grid) {

        int maxArea = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    int currArea = area(grid, i, j);
                    maxArea = Math.max(currArea, maxArea);
                }
            }
        }

        return maxArea;
    }

    public int area(int[][] grid, int sr, int sc) {

        if (sr < 0 || sc < 0 || sr >= grid.length || sc >= grid[0].length || grid[sr][sc] == 0)
            return 0;

        grid[sr][sc] = 0;

        return area(grid, sr + 1, sc) +
                area(grid, sr - 1, sc) +
                area(grid, sr, sc + 1) +
                area(grid, sr, sc - 1) + 1;
    }
}