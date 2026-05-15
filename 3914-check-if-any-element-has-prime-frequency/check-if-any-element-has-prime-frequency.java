class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        HashMap<Integer, Integer> map=new HashMap<>();
        int flag=0;
        
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }

        for(int freq:map.values()){
            if(freq<2){
                continue;
            }
            boolean isPrime=true;
            for(int i=2;i*i<=freq;i++){
                if(freq%i==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                return true;
            }
        }
        
        return false;
        
    }
}