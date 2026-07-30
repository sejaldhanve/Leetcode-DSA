class Solution {
    private void print(int index, List<Integer> subList, List<List<Integer>> list, int[] nums){
        if(index>=nums.length){
            list.add(new ArrayList<>(subList));
            return;
        }

        subList.add(nums[index]);
        print(index+1, subList, list, nums);
        subList.remove(subList.size()-1);
        print(index+1, subList, list, nums);

    }
   
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> subList=new ArrayList<>();
        int index=0;
        print(index, subList, list, nums);

        return list;
        
    }
}