class Solution {
    public String minWindow(String s, String t) {

       // TC->O(N)
       // SC->O(1)

        if(s.length()<t.length()) return"";
        
        int []freq = new int[128];

        for(int i=0 ;i<t.length();i++){

            int x = t.charAt(i);
            freq[x]++;
        }

        int minLength = Integer.MAX_VALUE;
        int left =0 ;
        int right =0;
        int count = t.length();
        int start = 0;
        while(right<s.length()){
            char c= s.charAt(right);

            if(freq[c]>0){
                count--;
            }
            freq[c]--;
           

            while(count==0){
                if(right-left+1 < minLength){
                    minLength = right-left+1;
                    start = left;
                }

                char leftChar = s.charAt(left);
                freq[leftChar]++;

                if(freq[leftChar] > 0){
                    count++;
                }
                left++;

            }

             right++;
        }

    if(minLength == Integer.MAX_VALUE ){
        return "";
    }else{
        return s.substring(start ,start+minLength);
    }
    }
}