class Solution {
    private void printSubsets(int index, int[] nums, List<List<Integer>> list, List<Integer> subList){
        if(index>=nums.length){
            if(!list.contains(new ArrayList<>(subList))){
                list.add(new ArrayList<>(subList));
            }
            return;
        }
        subList.add(nums[index]);
        printSubsets(index+1, nums, list, subList);
        subList.remove(subList.size()-1);
        printSubsets(index+1, nums, list, subList);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list= new ArrayList<>();
        List<Integer> subList=new ArrayList<>();
        int index=0;
        Arrays.sort(nums);
        printSubsets(index, nums, list, subList);

        return list;
        
    }
}