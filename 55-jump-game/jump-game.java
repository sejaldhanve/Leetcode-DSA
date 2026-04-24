class Solution {
    public boolean canJump(int[] nums) {
        int i=0;
        int maxReach=0;
        while(i<nums.length){
            if(i>maxReach){
                return false;
            }
            maxReach=Math.max(maxReach, i+nums[i]);
            i++;
        }
    return true; 
    }
}