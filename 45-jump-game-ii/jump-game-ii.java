class Solution {
    public int jump(int[] nums) {
        int[] dp=new int[nums.length+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        int index=0;
        dp[nums.length-1]=0;

        for(int i=nums.length-2;i>=0;i--){
            for(int nextJump=1;nextJump<=nums[i];nextJump++){
                int nextPos=i+nextJump;
                if(nextPos<nums.length){
                    int sub=dp[nextPos];
                    if(sub!=Integer.MAX_VALUE){
                        dp[i]=Math.min(dp[i], 1+sub);
                    }
                }
            }
        }
        return dp[0];
          
    }
}