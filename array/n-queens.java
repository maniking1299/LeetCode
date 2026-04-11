class Solution {
    //TC->O((N! * N))
    //SC->O((k * N^2))
      List<List<String>> res = new ArrayList<>(); 
    public List<List<String>> solveNQueens(int n) {
          solution(n,0, new ArrayList<>(),new HashSet<>(),new HashSet<>(),new HashSet<>());
          return res;
    }
     public void solution(int n,int i, ArrayList<String> curr,HashSet<Integer> col,HashSet<Integer> dai,HashSet<Integer>antidai){
        if(i==n){
            res.add(new ArrayList<>(curr));
            return ;
        }

        for(int j=0 ; j<n ;j++){
            if(!(col.contains(j) || dai.contains(i-j) || antidai.contains(i+j))){
                // make a string
                char[] row = new char[n];
                Arrays.fill(row, '.');
                row[j] = 'Q';
                String rowStr = new String(row);
                curr.add(rowStr);
                // Set initilization
                col.add(j);
                dai.add(i-j);
                antidai.add(i+j);
                // recurse
                solution(n,i+1,curr,col,dai,antidai);
                // Backtrack
                col.remove(j);
                dai.remove(i-j);
                antidai.remove(i+j);
                curr.remove(curr.size()-1);

            }
        }


    }
}