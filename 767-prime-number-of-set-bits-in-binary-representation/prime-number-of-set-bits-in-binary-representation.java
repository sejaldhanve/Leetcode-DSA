class Solution {
    private boolean isPrime(int num){
        if(num<2){
            return false;
        }
            for(int j=2;j*j<=num;j++){
                if(num%j==0){
                    return false;
                }
            }
            return true;
        }
    public int countPrimeSetBits(int left, int right) {
        int output=0;
        int count=0;
        for(int i=left;i<=right;i++){
            count=Integer.bitCount(i);

            if(isPrime(count)){
                output++;
            }
        }
        return output;
        
    }
}