class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
// Bucket Sort
// TC->O(N)
// SC->O(N)
        for(char ch: s.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }

        List<Character>[] bucket = new ArrayList[s.length()+1];

        for(char i: hm.keySet()){
            int fre = hm.get(i);
            if(bucket[fre] == null){
                bucket[fre] = new ArrayList<>();
            }
            bucket[fre].add(i);
        }

        StringBuilder sb = new StringBuilder();

        for(int i=bucket.length-1 ; i>=0 ;i--){
            if(bucket[i]!=null){
                for(char ch: bucket[i]){
                   for (int j = 0; j < i; j++) {
                        sb.append(ch);
                    }
                }
            }
        }

        return sb.toString();
        
    }
}