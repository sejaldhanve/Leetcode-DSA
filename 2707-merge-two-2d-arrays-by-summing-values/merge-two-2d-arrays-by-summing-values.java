class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        Map<Integer, Integer> map=new HashMap<>();
        for(int[] num:nums1){
            map.put(num[0] , map.getOrDefault(num[0], 0)+num[1]);
        }
        for(int[] num:nums2){
            map.put(num[0] , map.getOrDefault(num[0], 0)+num[1]);
        }

        int[][] arr=new int[map.size()][2];
        List<Integer> list=new ArrayList<>(map.keySet());
        Collections.sort(list);

        int i=0;
        for(int value:list){
            arr[i][0]=value;
            arr[i][1]=map.get(value);
            i++;
        }
    return arr;
        
    }
}