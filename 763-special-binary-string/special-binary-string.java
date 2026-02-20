class Solution {

    public String makeLargestSpecial(String s) {
        List<String> parts=new ArrayList<>();
        int start=0;
        int sum=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                sum++;
            }
            else{
                sum--;
            }
            if(sum==0){
                String inner=s.substring(start+1,i);
                String processed="1"+makeLargestSpecial(inner)+"0";
                parts.add(processed);
                start=i+1;
            }
        }
        Collections.sort(parts, Collections.reverseOrder());

        StringBuilder results=new StringBuilder();
        for(String str: parts){
            results.append(str);
        }
        return results.toString();
        
    }
}