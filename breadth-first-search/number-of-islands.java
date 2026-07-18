class Solution {
    public int numIslands(char[][] grid) {

        int count = 0;

        for(int i=0 ; i<grid.length ;i++){
            for(int j=0 ;j<grid[0].length ;j++){
                if(grid[i][j] == '1'){
                    count++;
                    explore(grid , i ,j);
                }
            }
        }

        return count;
        
    }
    public void explore(char[][] grid , int sr ,int sc){

            if(sr<0 || sc<0 || sr>=grid.length || sc>=grid[0].length || grid[sr][sc] == '0' ){
                return;
            }

            grid[sr][sc] = '0';

            explore(grid , sr-1,sc);
            explore(grid , sr+1,sc);
            explore(grid , sr,sc+1);
            explore(grid , sr,sc-1);

    }
}