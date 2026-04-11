class Solution {
    public int firstUniqueEven(int[] nums) {

        // TC-O(N)
        // SC-O(N)

        if(nums.length == 1 && nums[0]%2 == 0) return nums[0];

        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }

        for(int i:nums){
            if(hm.get(i) == 1){
                if(i%2==0){
                    return i;
                }
            }
        }

        return -1;
    }
}