class Solution {
    public boolean uniformArray(int[] nums1) {
        int min = Integer.MAX_VALUE;

        for(int i:nums1){
            min = Math.min(min,i);
        }

        // If the min is odd it is always possible
        if(min %2 != 0){
            return true;
        }

        // If the min is even then check if all are even other wise not possible
        for(int i:nums1){
            if(i%2 != 0){
                return false;
            }
        }

        return true;
    }
}