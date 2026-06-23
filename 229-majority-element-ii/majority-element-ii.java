class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        HashMap<Integer, Integer> map=new HashMap<>();
        List<Integer> list=new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }

        for(int key:map.keySet()){
            int ans=n/3;
            if(map.get(key)>ans){
                list.add(key);
            }
        }

        return list;
    }
}