class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        HashMap<Integer, Integer> map=new HashMap<>();
        int flag=0;
        
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }

        for(int freq:map.values()){
            if(isPrime(freq)){
                return true;
            }
        }
        
        return false;
        
    }
    private boolean isPrime(int n){
        if(n<2){
            return false;
        }
        boolean isPrime=true;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;

    }
}