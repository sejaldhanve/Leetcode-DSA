class Solution {
    public int missingNumber(int[] nums) {
        int size=nums.length;
        int sum=0;
        for(int i=0;i<=size;i++){
            sum+=i;
        }
        for(int i=0;i<nums.length;i++){
            sum-=nums[i];
        }
        return sum;
    }
}