class Solution {
    public boolean digitCount(String num) {
        HashMap<Character, Integer> map=new HashMap<>();
        for(int i=0;i<num.length();i++){
            map.put(num.charAt(i), map.getOrDefault(num.charAt(i),0)+1);
        }
        for(int i=0;i<num.length();i++){
            int expected= num.charAt(i)-'0';
            char digit=(char)(i+'0');
            int actual=map.getOrDefault(digit, 0);

            if(expected!=actual){
                return false;
            }

        }
        return true;
        
    }
}