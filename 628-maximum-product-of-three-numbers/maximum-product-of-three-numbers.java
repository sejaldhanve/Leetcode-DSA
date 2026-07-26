class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int prod=0;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int l=i+1;
            int r=nums.length-1;
            while(l<r){
                prod=nums[i]*nums[l]*nums[r];
                maxi=Math.max(maxi, prod);
                l++;
                r--;
            }
        }
        return maxi;
        
    }
}