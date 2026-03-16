class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet set1=new HashSet<>();
        HashSet set2=new HashSet<>();
        for(int val:nums1){
            set1.add(val);
        }
        for(int val:nums2){
            set2.add(val);
        }
        HashSet ans1=new HashSet<>();
        for(int val:nums1){
            if(!set2.contains(val)){
                ans1.add(val);
            }
        }
        HashSet ans2=new HashSet<>();
        for(int val:nums2){
            if(!set1.contains(val)){
                ans2.add(val);
            }
        }
        
        return Arrays.asList(new ArrayList<>(ans1), new ArrayList<>(ans2));
    }
}