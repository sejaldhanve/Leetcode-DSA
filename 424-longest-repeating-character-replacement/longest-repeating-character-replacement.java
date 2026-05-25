class Solution {
    public int characterReplacement(String s, int k) {
        int l=0;
        int r=0;
        int len=0;
        int maxFreq=0;
        int ans=0;
        int[] freq=new int[26];
        while(r<s.length()){
            freq[s.charAt(r)-'A']++;
            maxFreq=Math.max(maxFreq, freq[s.charAt(r)-'A']);
            if((r-l+1)-maxFreq>k){
                freq[s.charAt(l)-'A']--;
                l=l+1;
            }
            ans=Math.max(ans, r-l+1);
            r++;
        }
    return ans;  
    }
}