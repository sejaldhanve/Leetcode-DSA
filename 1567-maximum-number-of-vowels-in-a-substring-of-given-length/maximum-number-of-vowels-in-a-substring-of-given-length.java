class Solution {
    public int maxVowels(String s, int k) {
        int l=0, r=0, maxVowel=0, window=0;
        
        while(r<k){
            if(isVowel(s.charAt(r))){
                window++;
            }
            r++;
        }
        maxVowel=window;
        while(r<s.length()){
            if(isVowel(s.charAt(l))){
                window-=1;
            }
            l++;
            if(isVowel(s.charAt(r))){
                window+=1;
            }
            maxVowel=Math.max(maxVowel, window);
            r++;
        }
        
        return maxVowel;
    }
    private boolean isVowel(char c){
        return (c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ) ? true : false;
    }
}