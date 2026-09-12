class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {

        int n = grid.length;

        int freq[] = new int[n*n];

   // Making a freq array

        for(int i= 0 ; i<n ;i++){
            for(int j=0 ; j<n ;j++){
                int no = grid[i][j];
                freq[no-1]++;
            }
        }

        int a=0,b=0;
        
 // Now checking the freq array and finding the real a,b

        for(int i=0 ; i<freq.length ;i++){
            if(freq[i] >1){
                a = i+1;
            }
            if(freq[i] == 0){
                b = i+1;
            }
        }

        return new int[]{a,b};


    }
}