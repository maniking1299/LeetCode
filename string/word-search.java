class Solution {
    // TC->O(N * M * 4^L)
    // SC->O(L)
    public boolean exists(char[][] board,int i,int j, char[] words , int idx){
        if(idx == words.length){
            return true;
        }
        if(i<0 || j<0 || i>=board.length || j>=board[0].length || board[i][j]=='*'|| board[i][j]!=words[idx] ){
            return false;
        }

        char ch = board[i][j];
        board[i][j] = '*';

     boolean res =   exists(board,i+1,j,words,idx+1) ||
                     exists(board,i-1,j,words,idx+1) ||
                     exists(board,i,j+1,words,idx+1) ||
                     exists(board,i,j-1,words,idx+1);

         board[i][j] = ch;
         return res;            

    }

    public boolean exist(char[][] board, String word) {
        char[] word_arr = word.toCharArray();

        for(int i=0 ;i<board.length ;i++){
            for(int j=0 ;j<board[0].length ;j++){
                if(board[i][j] == word_arr[0] && exists(board,i,j,word_arr,0)){
                    return true;
                }
            }
        }

        return false;
    }
}