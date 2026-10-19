public class Solution {
    public bool ContainsDuplicate(int[] nums) {
        Dictionary<int, int> dict=new Dictionary<int, int>();
        for(int i=0;i<nums.Count();i++){
            if(dict.ContainsKey(nums[i])){
                dict[nums[i]]++;
            }
            else{
                dict[nums[i]]=1;
            }
        }

        foreach(var item in dict){
            if(item.Value>1){
                return true;
            }
        }
        return false;
        
    }
}