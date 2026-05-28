class Solution {
    private void printSub(int index, int[] candidates, int target, int sum, List<List<Integer>> list, List<Integer> subList){
        if(index>=candidates.length){
            if(target==0){
                list.add(new ArrayList<>(subList));
            }
            return;
        }
        if(candidates[index]<=target){
            subList.add(candidates[index]);
            printSub(index, candidates, target-candidates[index], sum, list, subList);
            subList.remove(subList.size()-1);
        }
        printSub(index+1, candidates, target, sum, list, subList);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int index=0;
        int sum=0;
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> subList=new ArrayList();

        printSub(index, candidates, target, sum, list, subList);
        return list;
    }
}