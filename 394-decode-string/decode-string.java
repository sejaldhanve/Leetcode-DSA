class Solution {
    public String decodeString(String s) {
        Stack<Integer> numStack=new Stack<>();
        Stack<StringBuilder> strStack=new Stack<>();
        StringBuilder str=new StringBuilder();
        int num=0;

        for(char c:s.toCharArray()){
            //num, char, open vracket, close bracket
            if(c>='0' && c<='9'){
                num=num*10 +c - '0';
            }
            else if(c=='['){
                strStack.push(str);
                numStack.push(num);
                str=new StringBuilder();
                num=0;

            }
            else if(c==']'){
                StringBuilder temp=str;
                str=strStack.pop();
                int count=numStack.pop();

                while(count>0){
                    str.append(temp);
                    count--;
                }
            }
            else{
                str.append(c);
            }
        }
      return str.toString();  
    }
}