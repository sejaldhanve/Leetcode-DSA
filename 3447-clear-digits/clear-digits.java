class Solution {
    public String clearDigits(String s) {
        StringBuilder str=new StringBuilder();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i))){
                st.push(s.charAt(i));
            }
            else if(Character.isDigit(s.charAt(i))){
                if(!st.isEmpty()){
                    st.pop();
                }
            }   
        }

        while(!st.isEmpty()){
            str.append(st.pop());
        }

        return str.reverse().toString();

        
    }
}