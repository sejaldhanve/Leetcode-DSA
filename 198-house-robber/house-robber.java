class Solution {
    private int robFunc(int index, int[] dp, int[] nums){
        if(index==0){
            return nums[index];
        }
        if(index<0){
            return 0;
        }
        if(dp[index]!=-1){
            return dp[index];
        }
        int pick=nums[index]+robFunc(index-2, dp, nums);
        int notpick=0+robFunc(index-1, dp, nums);

        return dp[index]=Math.max(pick, notpick);
    }
    public int rob(int[] nums) {
        int[] dp=new int[nums.length+1];
        Arrays.fill(dp, -1);
        int index=nums.length-1;
        return robFunc(index, dp, nums);
        
    }
}