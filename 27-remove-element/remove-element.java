class Solution {
    public int removeElement(int[] nums, int val) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                list.add(nums[i]);
            }
        }
        int count=list.size();
        for(int i=0;i<list.size();i++){
            nums[i]=list.get(i);
        }
        for(int i=list.size()+1;i<nums.length;i++){
            nums[i]='_';
        }

        return count;
        
    }
}