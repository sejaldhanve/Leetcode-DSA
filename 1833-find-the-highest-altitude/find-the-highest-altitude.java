class Solution {
    public int largestAltitude(int[] gain) {
        int[] newarr=new int[gain.length+1];
        newarr[0]=0;
        int highest=0;
        for(int i=1;i<gain.length+1;i++){
            newarr[i]=newarr[i-1]+gain[i-1];
            if(newarr[i]>highest){
                highest=newarr[i];
            }

        }
    return highest;  
    }
}