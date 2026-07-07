class Solution {
    public long sumAndMultiply(int n) {
        int num=n;
        int sum=0;
        int x=0;
        int rev=0;
        while(num!=0){
            int dig=num%10;
            if(dig!=0){
                x=x*10+dig;
                sum+=dig;
            }
            num=num/10;   
        }
        while(x!=0){
            int dig=x%10;
            rev=rev*10+dig;
            x=x/10;   
        }

        return (long)sum*rev;
        
    }
}