class Solution {
    public List<String> letterCombinations(String digits) {

        // TC-O(n*4^n)
        // SC-O(n*4^n)

        String[] map = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        String s = "";
        ArrayList<String> res = new ArrayList<>();
        if(digits.isEmpty()) return res;
        recuur(0,digits,s,map,res);

        return res;
        
    }
    private static void recuur(int i , String digits ,String s,String[] map, ArrayList<String> res){
        if(i == digits.length()){
            res.add(s);
            return;
        }

        String letters =  map[digits.charAt(i) - '0'];

        for(int x=0 ;x<letters.length();x++){
            recuur(i+1,digits,s+letters.charAt(x),map , res);
        }
        
       
    }
}