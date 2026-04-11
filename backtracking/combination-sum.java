class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        generateCombinations(candidates , target , 0 , new ArrayList<Integer>());

        return result;
    }

  void generateCombinations(int[] candidates,int target,int position,List<Integer> currCombination){

        if(target == 0){
            result.add(new ArrayList<>(currCombination));
            return;
        }
        if(position == candidates.length){
            return;
        }

        if(candidates[position] <= target){
            currCombination.add(candidates[position]);
            generateCombinations(candidates,target-candidates[position],position,currCombination);
            currCombination.remove(currCombination.size()-1);
        }

        generateCombinations(candidates,target,position+1,currCombination);

        
   }
} 