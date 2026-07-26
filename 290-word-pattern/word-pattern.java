class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words=s.split(" ");
        HashMap<Character, String> map1=new HashMap<>();
        HashMap<String, Character> map2=new HashMap<>();
        if(pattern.length()!=words.length){
            return false;
        }
        for(int i=0;i<pattern.length();i++){
            map1.putIfAbsent(pattern.charAt(i), words[i]);
            map2.putIfAbsent(words[i],pattern.charAt(i));
            if(!map1.get(pattern.charAt(i)).equals(words[i])){
                return false;
            }
            if(!map2.get(words[i]).equals(pattern.charAt(i))){
                return false;
            }
        }
        return true;   
    }
}