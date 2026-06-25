class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int n=nums.length;
        int[] pref=new int[n+1];

        for(int i=0;i<n;i++){
            if(nums[i]==target){
                pref[i+1]=pref[i]+1;
            }
            else{
                pref[i+1]=pref[i]-1;
            }
        }
        int ans=0; 
        for(int i=0;i<=n;i++){
            for(int j=i+1;j<=n;j++){
                if(pref[j]>pref[i]){
                    ans++;
                }
            }
        }

        return ans;
        
    }
}