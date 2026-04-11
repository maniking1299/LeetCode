class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        generateCombi2(candidates,target,0,new ArrayList<>());
        return result;
    }
    void generateCombi2(int[] candidates ,int target , int position , ArrayList<Integer> currCombi){
        if(target == 0){
            result.add(new ArrayList<>(currCombi));
            return;
        }
        if(position == candidates.length){
            return;
        }

        if(candidates[position] <= target){
            currCombi.add(candidates[position]);
            generateCombi2(candidates , target-candidates[position],position+1,currCombi);
            currCombi.remove(currCombi.size()-1);
        }
        while(position+1 < candidates.length && candidates[position] ==candidates[position+1] ){
            position++;
        }

        generateCombi2(candidates,target,position+1,currCombi);


    }
}