class Solution {
    public int characterReplacement(String s, int k) {
        int l=0;
        int r=0;
        int len=0;
        int maxFreq=0;
        int ans=0;
        HashMap<Character, Integer> map=new HashMap<>();
        while(r<s.length()){
            map.put(s.charAt(r), map.getOrDefault(s.charAt(r),0)+1);
            maxFreq=Math.max(maxFreq, map.get(s.charAt(r)));
            len=r-l+1;
            if((len-maxFreq)>k){
                map.put(s.charAt(l), map.get(s.charAt(l))-1);
                l=l+1;
            }
            ans=Math.max(ans, r-l+1);
            r++;
        }
    return ans;  
    }
}