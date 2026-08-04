class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        int min = nums[0];
        int max = nums[0];

        for(int i:nums){
            max = Math.max(max,i);
            min = Math.min(min,i);
        }

        ArrayList <Integer> ans = new ArrayList<>();

        HashSet<Integer> hm = new HashSet<>();

        for(int i: nums){
            hm.add(i);
        }

        for(int i=min+1 ; i<max;i++){
            if(!hm.contains(i)){
                ans.add(i);
            }
        }

        return ans;
    }
}