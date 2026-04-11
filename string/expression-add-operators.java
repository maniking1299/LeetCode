class Solution {
    public List<String> addOperators(String num, int target) {
        // TC->O(3^n *n)
        // SC->O(3^n *n)
        List<String> ans = new ArrayList<>();
        solve(num,0,target,"",ans,0,0);
        return ans;
    }
    public void solve(String nums,int index ,int target, String curr,List<String> ans,long prev,long res){
        if(index==nums.length()){
            if(res == target){
            ans.add(curr);
            }
            return;
        }

        String st ="";
        long currRes = 0;

        for(int i=index; i<nums.length() ;i++){
            if(i>index && nums.charAt(index)=='0') break;

            st = st+nums.charAt(i);
            currRes = currRes*10+(nums.charAt(i)-'0');

            if(index==0){
                solve(nums,i+1,target,st,ans,currRes,currRes);
            }else{
                solve(nums,i+1,target,curr+"+"+st,ans,currRes,res+currRes);
                solve(nums,i+1,target,curr+"-"+st,ans,-currRes,res-currRes);
                solve(nums,i+1,target,curr+"*"+st,ans,prev*currRes,res-prev+(prev*currRes));
            }
        }

    }
}