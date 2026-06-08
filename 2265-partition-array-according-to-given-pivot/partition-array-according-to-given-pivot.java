class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] ans=new int[nums.length];
        List<Integer> list=new ArrayList<>();
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                list.add(nums[i]);
            } 
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==pivot){
                list.add(nums[i]);
            } 
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>pivot){
                list.add(nums[i]);
            } 
        }


        for(int i=0;i<nums.length;i++){
            ans[i]=list.get(i);
        }

        return ans;

        
    }
}