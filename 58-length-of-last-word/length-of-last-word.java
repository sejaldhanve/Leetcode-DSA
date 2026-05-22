class Solution {
    public int lengthOfLastWord(String str) {
        String sub="";
        str=str.trim();
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)==' '){
                break;
            }
            sub+=str.charAt(i);
        }
        return sub.length();
    }
    
}