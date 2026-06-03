class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        Map<Integer, Integer> map=new HashMap<>();

        for(int[] item : items1){
            map.put(item[0], map.getOrDefault(item[0], 0)+item[1]);
        }

        for(int[] item : items2){
            map.put(item[0], map.getOrDefault(item[0], 0)+item[1]);
        }
        
        List<Integer> values=new ArrayList<>(map.keySet());
        Collections.sort(values);
        List<List<Integer>> ans=new ArrayList<>();

        for(int value:values){
            ans.add(Arrays.asList(value, map.get(value)));
        }

        return ans;
    }
}