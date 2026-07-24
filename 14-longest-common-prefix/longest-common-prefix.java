class Solution {
    public String longestCommonPrefix(String[] strs) {
        String str="";
        for(int i=0;i<strs[0].length();i++){
            for(int j=1;j<strs.length;j++){
                if(i==strs[j].length() || strs[0].charAt(i)!=strs[j].charAt(i)){
                    return str;
                }
            }
            str+=strs[0].charAt(i);

        }
        return str;
        

    }
}
