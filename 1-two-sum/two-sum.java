class Solution {
    public static int[] twoSum(int[] num, int target) {
        for(int i=0;i<=num.length-1;i++){
            for(int j=0;j<=num.length-1;j++){
                if(i==j){
                    break;
                }
                else if(num[i]+num[j]==target){
                    int[] ans=new int[2];
                    ans[0]=i;
                    ans[1]=j;
                    return ans;
                }
            }

        }
    return new int[0];
        
    }
    public static void main(String args[]){
        int[] num={3,3};
        int target=6;
        int[] ans= twoSum (num,target);
        System.out.println(ans[0]+','+ans[1]);

    }
}