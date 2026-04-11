class Solution {
    public int myAtoi(String s) {
 
 // TC->O(N)
 // SC->O(1)
 
        // Case 1
       s =  s.trim();

       if(s.length() == 0){
            return 0;
        }    

        int i=0;
        int sign =1;
        long num = 0;
        // Case 2
        if(s.charAt(i)=='-' || s.charAt(i)=='+'){
            sign = (s.charAt(i)=='-')?-1:1;
            i++;
        }
        
        // Case 3
        while(i<s.length() && Character.isDigit(s.charAt(i))){
            num = num*10 + (s.charAt(i)-'0');

            // Case 4
            if(num>Integer.MAX_VALUE && sign==1){
                return Integer.MAX_VALUE;
            }
            if(num>Integer.MAX_VALUE && sign==-1){
                return Integer.MIN_VALUE;
            }
            i++;
        }

        return (int)(sign*num);

       
    }
}