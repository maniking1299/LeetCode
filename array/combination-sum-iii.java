class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {

        // TC->O(2^9*k)
        // SC->O(k)

        Sum3(1,k,n,new ArrayList<>() , 0);

        return res;
        
    }
    void Sum3(int index, int k , int n , List<Integer> curr , int sum){
        if(curr.size() == k && sum == n){
            res.add(new ArrayList<>(curr));
        }

        if(sum > n || curr.size() == k || index > 9){
            return;
        }

        curr.add(index);
        sum = sum+index;

        Sum3(index+1 , k, n , curr , sum);

        curr.remove(curr.size()-1);
       sum = sum - index;
        Sum3(index+1,k,n,curr,sum);

    }
}