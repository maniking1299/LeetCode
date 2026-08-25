class Solution {
    public int missingMultiple(int[] nums, int k) {

        HashSet<Integer> set = new HashSet<>();

        for (int i : nums) {
            if(i%k == 0){
                set.add(i);
            }
        }

        for(int i=1; i<=set.size()+1 ;i++){
            if(!set.contains(i*k)){
                return i*k;
            }
        }

       return -1;

    }
}