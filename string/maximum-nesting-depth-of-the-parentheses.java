class Solution {
    public int maxDepth(String s) {
        int count =0;
        int max = Integer.MIN_VALUE;
        boolean flag = false;
        if(s.length()==1){
            return 0;
        }

        for(int i=0 ;i<s.length() ;i++){
            if(s.charAt(i)=='('){
                count++;
                flag = true;
                max = Math.max(max,count);
            }else if(s.charAt(i)==')'){
                count--;
            }
        }
        if(flag){

        return max;
        }else{
            return 0;
        }
    }
}