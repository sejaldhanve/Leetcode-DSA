class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int n=landStartTime.length;
        int m=waterStartTime.length;
        int mini=Integer.MAX_VALUE;
        int secmini=Integer.MAX_VALUE;
        int finish=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            mini=Math.min(mini, landStartTime[i]+landDuration[i]);
        }
        for(int j=0;j<m;j++){
            secmini=Math.min(secmini, waterStartTime[j]+waterDuration[j]);
        }

        for(int j=0;j<m;j++){
            int time=Math.max(mini, waterStartTime[j])+waterDuration[j];
            finish=Math.min(time, finish);
        }

        for(int i=0;i<n;i++){
            int time=Math.max(secmini, landStartTime[i])+landDuration[i];
            finish=Math.min(time, finish);
        }
    return finish;
    }
}