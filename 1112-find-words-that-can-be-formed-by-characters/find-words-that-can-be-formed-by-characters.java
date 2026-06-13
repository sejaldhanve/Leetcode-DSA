class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] freq=new int[26];
        int ans=0;
        for(int i=0;i<chars.length();i++){
            freq[chars.charAt(i)-'a']++;
        }

        for(String str:words){
            int[] wordFreq=new int[26];
            for(int i=0;i<str.length();i++){
                wordFreq[str.charAt(i)-'a']++;
            }

            boolean flag=true;
            for(int i=0;i<26;i++){
                if(wordFreq[i]>freq[i]){
                    flag=false;
                    break;
                }
            }

            if(flag){
                ans+=str.length();
            }
        }
        
    return ans;  
    }
}