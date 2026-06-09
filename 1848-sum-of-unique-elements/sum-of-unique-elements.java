class Solution {
    public int sumOfUnique(int[] nums) {
        int[] freq=new int[101];
        int ans=0;
        for(int num:nums){
            freq[num]++;
        }

        for(int num:nums){
            if(freq[num]==1){
                ans+=num;
            }
        }

        return ans;
        
    }
}