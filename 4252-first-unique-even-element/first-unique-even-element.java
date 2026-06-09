class Solution {
    public int firstUniqueEven(int[] nums) {
        int[] freq=new int[101];
        for(int num:nums){
            freq[num]++;
        }

        for(int num:nums){
            if(freq[num]==1 && num%2==0){
                return num;
            }
        }

        return -1;
        
    }
}