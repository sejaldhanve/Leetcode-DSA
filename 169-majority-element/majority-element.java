class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map=new HashMap<>();
        int maxi=0;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }

        for(int key:map.keySet()){
            if(map.get(key)>maxi){
                maxi=map.get(key);
                ans=key;

            }
        }
        return ans;
    }
}