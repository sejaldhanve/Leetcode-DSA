class Solution {
    private void printSubsets(int[] nums, int index, List<List<Integer>> list, List<Integer> subList){
        if(index>=nums.length){
            list.add(new ArrayList<>(subList));
            return;
        }
        subList.add(nums[index]);
        printSubsets(nums, index+1, list, subList);
        subList.remove(subList.size()-1);
        printSubsets(nums, index+1, list, subList);
        
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> subList=new ArrayList<>();
        int index=0;
        printSubsets(nums, index, list, subList);
        return list;
        
    }
}