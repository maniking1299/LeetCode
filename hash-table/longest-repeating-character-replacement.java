class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> hm = new HashMap<>();

        // TC->O(N)
        // SC->O(1)
        
        int i=0;
        int j=0;
        int maxfreq = 0;
        int maxLength = 0;

        while(j<s.length()){
            char c = s.charAt(j);
           hm.put(c,hm.getOrDefault(c,0)+1);

            maxfreq = Math.max(maxfreq,hm.get(c));
           int windowsize = j-i+1;

           if(windowsize-maxfreq <= k){
            maxLength = Math.max(maxLength,windowsize);
           
           }else{
            hm.put(s.charAt(i),hm.get(s.charAt(i))-1);
            i++;
            
           }
           j++;
        }

        return maxLength;
    }
}