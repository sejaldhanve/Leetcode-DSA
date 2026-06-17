class Solution {
    public String decodeAtIndex(String s, int k) {
        long len=0;
        long K=k;
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                len*=s.charAt(i)-'0';
            }
            else{
                len++;
            }
        }

        for(int i=s.length()-1;i>=0;i--){
            K%=len;
            if(Character.isDigit(s.charAt(i))){
                len=len/(s.charAt(i)-'0');
            }
            else{
                if(K==0){
                    return String.valueOf(s.charAt(i));
                }
                len--;
            }

        }  
        return "";      
    }
}