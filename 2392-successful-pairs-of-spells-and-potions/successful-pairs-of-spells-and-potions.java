class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions); 
        int[] ans=new int[spells.length];
        for(int i=0;i<spells.length;i++){
            long required=(success+spells[i]-1)/spells[i];
            int left=0;
            int right=potions.length-1;
            int firstValid=potions.length;
            while(left<=right){
                int mid=(left+right)/2;
                if(potions[mid]>=required){
                    firstValid=mid;
                    right=mid-1;
                }
                else{
                    left=mid+1;
                }
            }
            ans[i]=potions.length-firstValid;
        }
    return ans;  
        
    }
}