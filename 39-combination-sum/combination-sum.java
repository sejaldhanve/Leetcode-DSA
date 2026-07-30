class Solution {
    private void print(int i, List<List<Integer>> list, List<Integer> subList, int[] candidates, int target){
        if(target==0){
            list.add(new ArrayList<>(subList));
            return;
        }
        if(i==candidates.length){
            return;
        }
        if(target>=candidates[i]){
            subList.add(candidates[i]);
            print(i, list, subList, candidates, target-candidates[i]);
            subList.remove(subList.size()-1);
        }
        print(i+1, list, subList, candidates, target);

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> subList=new ArrayList<>();
        print(0, list, subList, candidates, target);
        return list;

    }
}