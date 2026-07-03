class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

    // Optmial Solution -> Transpose and reverse it
    // TC = O(n^2)
    // SC = O(1)

    // Find the transpose
    for(int i=0 ; i<n;i++){
        for(int j=i+1 ; j<n;j++){
            int temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp;
        }
    }
    // Reverse the cols 
    for(int i=0 ; i<n ;i++){
        for(int j=0 ;j<n/2 ;j++){
            int temp = matrix[i][j];
            matrix[i][j] = matrix[i][n-j-1];
            matrix[i][n-j-1] = temp;
        }
    }

 }
 
}


//////////////////////////////////////////////////////////////////////////////////////////////////////
        // Brute force way ->
        // TC = O(n^2)
        // SC = O(n^2)
        // int ans[][] = new int[n][n];
        // for(int i=0 ; i<n ;i++){
        //     for(int j=0 ; j<n ;j++){

        //         ans[j][n-1-i] = matrix[i][j];
        //     }
        // }

        // for(int i=0 ; i<n ; i++){
        //     for(int j=0 ; j<n ;j++){
        //         matrix[i][j] = ans[i][j];
        //     }
        // }
////////////////////////////////////////////////////////////////////////////////////////////////////////        
