class Solution {
    public int hIndex(int[] citations) {
       int ans=0;
       int n=citations.length;
        for(int i=n;i>=0;i--){
            int count=0;
            for(int j=0;j<citations.length;j++){
                if(citations[j]>=i){
                    count++;
                }
            }
            if(count>=i){
                return i;
            }
        }
        return 0;
        
    }
}