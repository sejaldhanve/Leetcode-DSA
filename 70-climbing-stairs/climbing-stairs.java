class Solution {
    private int func(int n, int[] arr){
        if(n==0){
            return 1;
        }
        if(n==1){
            return 1;
        }
        if(arr[n]!=-1){
            return arr[n];
        }
        return arr[n]=func(n-1, arr)+func(n-2, arr);
    }
    public int climbStairs(int n) {
        int[] arr=new int[n+1];
        Arrays.fill(arr, -1);
        return func(n, arr);
    }
}