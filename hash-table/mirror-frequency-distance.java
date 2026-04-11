class Solution {
    public int mirrorFrequency(String s) {
         int freq[] = new int[36];
        
        for(int i=0;i<s.length() ;i++){
            char ch = s.charAt(i);

            if(ch >='a' && ch<='z'){
                freq[ch-'a']++;
            }else{
                freq[26+(ch-'0')]++;
            }
        }
        int count = 0;
        for(int i=0 ;i<freq.length ;i++){
            int mirror;
            if(i<26){
                // letter (0,25)
                mirror = 25-i;
            }else{
                // digit(25,35)
                mirror =  35 - (i - 26);
            }
            if(i<mirror){   
                count +=Math.abs(freq[i]-freq[mirror]);
            }
        }

        return count;
    }
}