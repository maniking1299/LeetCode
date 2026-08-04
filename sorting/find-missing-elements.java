class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        int min = nums[0];
        int max = nums[0];

        for(int i:nums){
            max = Math.max(max,i);
            min = Math.min(min,i);
        }

        ArrayList <Integer> ans = new ArrayList<>();

       int []arr = new int[max+1];

        for(int i: nums){
            arr[i]++;
        }

        for(int i=min+1 ; i<max;i++){
            if(arr[i] == 0){
                ans.add(i);
            }
        }

        return ans;
    }
}