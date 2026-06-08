class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int pivotInd=0;
        int[] ans=new int[nums.length];
        List<Integer> less=new ArrayList<>();
        List<Integer> high=new ArrayList<>();
        List<Integer> equal=new ArrayList<>();
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                less.add(nums[i]);
            }
            else if(nums[i]>pivot){
                high.add(nums[i]);
            }
            else{
                equal.add(nums[i]);
            }   
        }

        less.addAll(equal);
        less.addAll(high);

        for(int i=0;i<less.size();i++){
            ans[i]=less.get(i);
        }

        return ans;

        
    }
}