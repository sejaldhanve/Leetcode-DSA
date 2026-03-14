class Solution {
    public int largestAltitude(int[] gain) {
        int[] newarr=new int[gain.length+1];
        newarr[0]=0;
        int highest=0;
        for(int i=1;i<=gain.length;i++){
            newarr[i]=newarr[i-1]+gain[i-1];
            highest=Math.max(highest,newarr[i]);

        }
    return highest;  
    }
}