class Solution {
    public String removeStars(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            st.push(s.charAt(i));
            if(s.charAt(i)=='*'){
                st.pop();
                st.pop();
            }
        }
        StringBuilder str=new StringBuilder();
        for(char c:st){
            str.append(c);
        }


    return str.toString();        
    }
}