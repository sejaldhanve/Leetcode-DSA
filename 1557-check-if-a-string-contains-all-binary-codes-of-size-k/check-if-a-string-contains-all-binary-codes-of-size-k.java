class Solution {
    public boolean hasAllCodes(String s, int k) {
        if(s.length()<k){
            return false;
        }
        Set<String> st=new HashSet<>();
        for(int i=k;i<=s.length();i++){
            String sub=s.substring(i-k,i);
            st.add(sub);
        }
        if(st.size()==Math.pow(2,k)){
            return true;
        }   
    return false; 
    }
}