class Solution {
    private int func(int i, int start, int[] nums, int[] dp){
        if(i<start){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int take=nums[i]+func(i-2, start, nums, dp);
        int nottake=func(i-1, start, nums, dp);

        return dp[i]=Math.max(take, nottake);
    }
    public int rob(int[] nums) {
        int i=nums.length;
        int dp1[]=new int[nums.length+1];
        int dp2[]=new int[nums.length+1];
        Arrays.fill(dp1, -1);
        Arrays.fill(dp2, -1);

        if(nums.length==1){
            return nums[0];
        }

        int excludefirst=func(i-1, 1, nums, dp1);
        int excludelast=func(i-2, 0, nums, dp2);

        return Math.max(excludefirst, excludelast);
        
    }
}