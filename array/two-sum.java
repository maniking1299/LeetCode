class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap <Integer,Integer> hm = new HashMap<>();

        for(int i=0; i<nums.length ;i++){
            int nm = nums[i];

            int sc = target - nm;

            if(hm.containsKey(sc)){
                return new int[]{hm.get(sc),i};
            }

            hm.put(nm,i);

        }

        return new int[]{-1,-1};
    }
}