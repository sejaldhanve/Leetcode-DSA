class Solution {
    public int equalPairs(int[][] grid) {
        HashMap<String, Integer> map=new HashMap<>();
        int pairs=0;
        for(int r=0;r<grid.length;r++){
            String row= Arrays.toString(grid[r]);
            map.put(row, map.getOrDefault(row,0)+1);
        }
        for(int j=0;j<grid.length;j++){
            int[] col=new int[grid.length];
            for(int i=0;i<grid.length;i++){
                col[i]=grid[i][j];
            }
            pairs+=map.getOrDefault(Arrays.toString(col),0);
        }
        return pairs;
    }
}