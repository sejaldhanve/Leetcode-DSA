class Solution {
    public int lengthOfLastWord(String str) {
        str=str.trim();
        int count=0;
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)==' '){
                break;
            }
            count++;
        }
        return count;
    }
    
}