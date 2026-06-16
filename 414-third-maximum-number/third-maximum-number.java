class Solution {
    public int thirdMax(int[] nums) {
        long max=Long.MIN_VALUE;
        long secmax=Long.MIN_VALUE;
        long thirdmax=Long.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==max || nums[i]==secmax || nums[i]==thirdmax){
                continue;
            }
            else if(nums[i]>max){
                thirdmax=secmax;
                secmax=max;
                max=nums[i];
            }
            else if(nums[i]<max && nums[i]>secmax){
                thirdmax=secmax;
                secmax=nums[i];
            }
            else if(nums[i]<secmax && nums[i]>thirdmax){
                thirdmax=nums[i];
            }
        }
        if(thirdmax==Long.MIN_VALUE){
            return (int)max;
        }
        return (int)thirdmax;
        
    }
}