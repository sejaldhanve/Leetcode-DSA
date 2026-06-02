class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int landFinish=0;
        int waterFinish=0;
        int waterStart=0;
        int landStart=0;
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<landStartTime.length && i<landDuration.length;i++){
            for(int j=0;j<waterStartTime.length && j<waterDuration.length;j++){
                landFinish=landStartTime[i]+landDuration[i];
                waterStart=Math.max(landFinish, waterStartTime[j]);
                waterFinish=waterStart+waterDuration[j];

                mini=Math.min(waterFinish, mini);
            }
            
        }
        for(int i=0;i<waterStartTime.length && i<waterDuration.length;i++){
            for(int j=0;j<landStartTime.length && j<landDuration.length;j++){
                waterFinish=waterStartTime[i]+waterDuration[i];
                landStart=Math.max(waterFinish, landStartTime[j]);
                landFinish=landStart+landDuration[j];

                mini=Math.min(landFinish, mini);
            }
            
        }
    return mini;  
    }
}