class Solution {
    private int func(int index, int[] nums, int[] dp){
        if(index>=nums.length-1){
            return 0;
        }
        int ans=Integer.MAX_VALUE;
        if(dp[index]!=-1){
            return dp[index];
        }
        for(int nextJump=1;nextJump<=nums[index];nextJump++){
            int nextPos=index+nextJump;
            if(nextPos<nums.length){
                int sub=func(nextPos, nums, dp);
                if(sub!=Integer.MAX_VALUE){
                    ans=Math.min(ans, 1+sub);
                }
            }
        }
        return dp[index]=ans;
    }
    public int jump(int[] nums) {
        int[] dp=new int[nums.length+1];
        Arrays.fill(dp, -1);
        int index=0;
        return func(index, nums, dp);  
    }
}