class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] n=new int[nums.length+1];
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            n[nums[i]]++;
        }

        for(int i=1;i<n.length;i++){
            if(n[i]==0){
                list.add(i);
            }
        }

        return list;   
    }
}