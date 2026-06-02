class Solution {
    public int arrayNesting(int[] nums) {
        boolean[] visited=new boolean[nums.length];
        int count=0;
        int maxLength=0;
        for(int i=0;i<nums.length;i++){
            if(!visited[i]){
                count=0;
                int cur=i;
                while(!visited[cur]){
                    visited[cur]=true;
                    cur=nums[cur];
                    count++;
                }
                maxLength=Math.max(maxLength,count);
            }
        }

    return maxLength;  
    }
}