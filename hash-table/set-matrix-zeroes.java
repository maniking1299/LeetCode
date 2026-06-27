class Solution {
    //TC-> O(m*n)
    //SC->O(1)
    public void setZeroes(int[][] matrix) {
          // Make a flag for 1st row and col.
        boolean firstRowZero = false;
        boolean firstColZero = false;

        // Check if 1st row or col has zeros

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                firstRowZero = true;
                break;
            }
        }

        for (int j = 0; j < matrix[0].length; j++) {
            if (matrix[0][j] == 0) {
                firstColZero = true;
                break;
            }
        }

        // now traverse the matrix and put the marker on the 1st row and col

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        // now make all the exements 0 according to the 1st row and col marker

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[0][j] == 0 || matrix[i][0] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // now if the 1st row or col has to be zero then make it

        if (firstRowZero) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }
        if (firstColZero) {
            for (int i = 0; i < matrix[0].length; i++) {
                matrix[0][i] = 0;
            }
        }
    }
}