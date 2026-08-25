class Solution {
    public int missingMultiple(int[] nums, int k) {

        HashSet<Integer> set = new HashSet<>();

        for (int i : nums) {
            set.add(i);
        }

        int x = 1;

        for(int i=0 ;i<nums.length ;i++){
            int mul = x*k;

            if(!set.contains(mul)){
                return mul;
            }

            x++;
        }

        return -1;

    }
}