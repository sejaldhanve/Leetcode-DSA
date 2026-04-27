class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set=new HashSet<>();
        Set<Integer> result=new HashSet<>();

        for(int nums : nums1){
            set.add(nums);
        }
        for(int nums : nums2){
            if(set.contains(nums)){
                result.add(nums);
            }
        }
        int arr[]=new int[result.size()];
        int i=0;
        for(int nums:result){
            arr[i]=nums;
            i++;
        }
        return arr;
    }
}