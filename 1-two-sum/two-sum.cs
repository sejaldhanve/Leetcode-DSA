public class Solution {
    public int[] TwoSum(int[] nums, int target) {
        for(int i=0;i<nums.Count();i++){
            for(int j=0;j<nums.Count();j++){
                if(i==j){
                    continue;
                }
                if(nums[i]+nums[j]==target){
                    return new int[]{i, j};
                }
            }

        }
        return new int[]{-1};
        
    }
}