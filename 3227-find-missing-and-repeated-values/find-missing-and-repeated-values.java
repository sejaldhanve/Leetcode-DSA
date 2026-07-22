class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int total=n*n;
        int freq[]=new int[total+1];
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                freq[grid[i][j]]++;
            }
        }
        int rep=-1;
        int miss=-1;
        for(int i=1;i<=total;i++){
            if(freq[i]>1) rep=i;
            if(freq[i]==0) miss=i;
        }
        return new int[]{rep, miss};
    }
}