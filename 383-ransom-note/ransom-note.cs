public class Solution {
    public bool CanConstruct(string ransomNote, string magazine) {
        int[] freq1=new int[26];
        int[] freq2=new int[26];
        for(int i=0;i<ransomNote.Length;i++){
            freq1[ransomNote[i]-'a']++;
        }
        for(int i=0;i<magazine.Length;i++){
            freq2[magazine[i]-'a']++;
        }

        for(int i=0;i<26;i++){
            if(freq2[i]<freq1[i]){
                return false;
            }
        }
        return true;
        
    }
}