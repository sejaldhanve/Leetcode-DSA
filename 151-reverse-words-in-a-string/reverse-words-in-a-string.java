class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        StringBuilder str=new StringBuilder();
        String[] words=s.split("\\s+");
        for(int i=words.length-1;i>=0;i--){
            str.append(words[i]);
            if(i!=0){
                str.append(" ");
            }
        }


        return str.toString();


    }
}