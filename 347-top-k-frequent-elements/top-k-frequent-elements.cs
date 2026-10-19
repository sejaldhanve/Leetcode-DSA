public class Solution {
    public int[] TopKFrequent(int[] nums, int k) {
        Dictionary<int, int> dict=new Dictionary<int, int>();
        for(int i=0;i<nums.Count();i++){
            if(dict.ContainsKey(nums[i])){
                dict[nums[i]]++;
            }
            else{
                dict[nums[i]]=1;
            }
        }
        var sorteddict=dict.OrderByDescending(x=>x.Value);
        List<int> list=new List<int>();
        
        foreach(var item in sorteddict){
            list.Add(item.Key);
            if(list.Count()==k){
                break;
            }
        }
        
        return list.ToArray();
    
        
    }
}