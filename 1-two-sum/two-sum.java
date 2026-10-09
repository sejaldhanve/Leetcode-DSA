class Solution {
    public static int[] twoSum(int[] num, int target) {
        for(int i=0;i<=num.length-1;i++){
            for(int j=0;j<=num.length-1;j++){
                if(i==j){
                    continue;
                }
                else if(num[i]+num[j]==target){
                    int[] ans=new int[2];
                    return new int[]{i, j};
                }
            }

        }
    return new int[0];
        
    }
}