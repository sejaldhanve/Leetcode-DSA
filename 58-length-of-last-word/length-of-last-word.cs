public class Solution {
    public int LengthOfLastWord(string s) {
        string str=s.Trim();
        int count=0;
        for(int i=str.Count()-1;i>=0;i--){
            if(str[i]==' '){
                break;
            }
            count++;

        }
        return count;
        
    }
}