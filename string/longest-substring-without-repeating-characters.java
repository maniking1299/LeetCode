class Solution {
    public int lengthOfLongestSubstring(String s) {

        // TC ->O(N)
        // SC ->O(N)
        
        HashMap<Character,Integer> hm = new HashMap<>();
        int i=0;
        int j=0;
        int maxLength =0;

        while(j<s.length()){
            char c = s.charAt(j);
        // If it has duplicate then shrink the window and make i the latest value of duplicate.
            if(hm.containsKey(c)){
                i = Math.max(i,hm.get(c)+1);
            }
        // If there is no duplicate store it in hashmap with index
        hm.put(c,j);

        maxLength = Math.max(maxLength,j-i+1);
        j++;
        }

    return maxLength;
    }
}