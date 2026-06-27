class Solution {
    public int maximumLength(int[] nums) {
        int ans=0;
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        int ones=map.getOrDefault(1, 0);
        if(ones>0 && ones%2==0){
            ans= ones-1;
        }
        else{
            ans= ones;
        }

        for(int start:map.keySet()){
            if(start==1){
                continue;
            }
            int cur=start;
            int len=0;

            while(map.getOrDefault(cur, 0)>=2){
                len+=2;
                cur=cur*cur;
            }

            if(map.getOrDefault(cur, 0)==1){
                len+=1;
            }
            else{
                len-=1;
            }

            ans=Math.max(ans, len);
        }
        return ans;
        
    }
}