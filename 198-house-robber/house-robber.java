class Solution {
    public int rob(int[] nums) {
        int[] dp=new int[nums.length];
        int prev=nums[0];
        int prev2=0;
        int cur=0;
        
        for(int i=1;i<nums.length;i++){
            int pick=nums[i];
            if(i>1){
                pick+=prev2;
            }
            int notpick=0+prev;
            cur=Math.max(pick, notpick);

            prev2=prev;
            prev=cur;
        }

        return prev;
        
    }
}