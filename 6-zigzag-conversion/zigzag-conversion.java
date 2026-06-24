class Solution {
    public String convert(String s, int numRows) {
        StringBuilder[] rows=new StringBuilder[numRows];

        if(numRows==1){
            return s;
        }
        for(int i=0;i<numRows;i++){
            rows[i]=new StringBuilder();
        }

        int curr=0;
        boolean down=true;
        for(char ch:s.toCharArray()){
            rows[curr].append(ch);
            if(curr==0){
                down=true;
            }
            else if(curr==numRows-1){
                down=false;
            }

            if(down==true){
                curr++;
            }
            else{
                curr--;
            }
        }

        StringBuilder result=new StringBuilder();
        for(StringBuilder row:rows){
            result.append(row);

        }

        return result.toString();
        
    }
}